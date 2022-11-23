package com.teacher.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.teacher.sqlitedatabase.contracts.SubjectReaderContract;
import com.teacher.sqlitedatabase.contracts.TeacherReaderContract;
import com.teacher.sqlitedatabase.data.SQLSubject;
import com.teacher.sqlitedatabase.data.SQLTeacher;
import com.teacher.sqlitedatabase.databasehelpers.SubjectReaderDBHelper;
import com.teacher.sqlitedatabase.databasehelpers.TeacherReaderDBHelper;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SQLiteDatabaseHandler implements IDatabaseHandler {
    private Context _context;
    private static final String separator = ";";

    public SQLiteDatabaseHandler(Context context){
        _context = context;
        // todo remove this in production
        //initFakeData();
        //setup();
        // todo
    }

    // todo remove this
    public void initFakeData(){
        List<ITeacher>  t = getAllTeachers();
        if(t.size() != 0){
            SubjectReaderDBHelper sHelper = new SubjectReaderDBHelper(_context);
            SQLiteDatabase sdb = sHelper.getWritableDatabase();
            sHelper.deleteDB(sdb);
            sHelper.onCreate(sdb);

            TeacherReaderDBHelper tHelper = new TeacherReaderDBHelper(_context);
            SQLiteDatabase tdb = tHelper.getWritableDatabase();
            tHelper.deleteDB(tdb);
            tHelper.onCreate(tdb);
        }

        ITeacher teach =new SQLTeacher(
                -1,
                "Első Endre",
                null,
                new ArrayList<ISubject>(){
                    {
                        add(new SQLSubject(-1,0,"Matematika",2000));
                        add(new SQLSubject(-1,0,"Magyar",13000));
                    }
                },
                "elsoEndre99@gmail.com",
                "+36203454323"
        );
        teach.password="12345";
        addOrEditTeacher(teach);
        ITeacher teach2 = new SQLTeacher(
                -1,
                "Második Márk",
                null,
                new ArrayList<ISubject>(){
                    {
                        add(new SQLSubject(-1,0,"Matematika",3000));
                        add(new SQLSubject(-1,0,"Matematika",3000));
                        add(new SQLSubject(-1,0,"Matematika",3000));
                    }
                },
                "MM99@gmail.com",
                "+36703476323"
        );
        teach2.password = "";
        addOrEditTeacher(teach2);
    }
    public void setup() {
        SubjectReaderDBHelper sHelper = new SubjectReaderDBHelper(_context);
        SQLiteDatabase sdb = sHelper.getWritableDatabase();
        sHelper.deleteDB(sdb);
        sHelper.onCreate(sdb);

        TeacherReaderDBHelper tHelper = new TeacherReaderDBHelper(_context);
        SQLiteDatabase tdb = tHelper.getWritableDatabase();
        tHelper.deleteDB(tdb);
        tHelper.onCreate(tdb);
    }

    // remove end
    @Override
    public boolean addOrEditTeacher(ITeacher teacher) {

        TeacherReaderDBHelper dbHelper = new TeacherReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(TeacherReaderContract.TeacherEntry.NAME, teacher.name);
        values.put(TeacherReaderContract.TeacherEntry.IMAGE, bitmapToByte(teacher.image));
        values.put(TeacherReaderContract.TeacherEntry.EMAIL,teacher.email);
        values.put(TeacherReaderContract.TeacherEntry.PHONE, teacher.phoneNumber);
        values.put(TeacherReaderContract.TeacherEntry.PASSWORD, SupportLogic.GetHashedPassword(teacher.password));

        // Insert the new row, returning the primary key value of the new row
        // TODO: duplicate teacher is not allowed
        long newRowId;
        if(teacher.id < 0) {
            if(getIfTeacherExist(teacher)){
                return false;
            }
            newRowId = db.insert(TeacherReaderContract.TeacherEntry.TABLE_NAME, null, values);
        }
        else{
            values.put(TeacherReaderContract.TeacherEntry._ID, teacher.id);
            newRowId = db.update(
                    TeacherReaderContract.TeacherEntry.TABLE_NAME,
                    values,
                    TeacherReaderContract.TeacherEntry._ID+"="+teacher.id,
                    null);
        }

        if(newRowId==-1){
            return false;
        }
        if(!insertSubjects(newRowId,teacher.getSubjects())) {
            return false;
        };
        Log.d("SQLLite", "addOrEditTeacher:  " + teacher.name);

        return true;
    }

    private boolean insertSubjects(long teacherId, List<ISubject> subjects){
        SubjectReaderDBHelper dbHelper = new SubjectReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        List<ISubject> previousSubjects = getAllSubjects(teacherId);
        for(ISubject subject:previousSubjects){
            db.delete(SubjectReaderContract.SubjectsEntry.TABLE_NAME,SubjectReaderContract.SubjectsEntry.TEACHER_ID+"="+teacherId,null);
        }

        for (ISubject subject :subjects){
            ContentValues values = new ContentValues();
            values.put(SubjectReaderContract.SubjectsEntry.TEACHER_ID, teacherId);
            values.put(SubjectReaderContract.SubjectsEntry.NAME, subject.name);
            values.put(SubjectReaderContract.SubjectsEntry.PRICE, subject.price);
            db.insert(SubjectReaderContract.SubjectsEntry.TABLE_NAME, null, values);
        }

        return true;
    }

    private byte[] bitmapToByte(Bitmap pics){
        if(pics == null){
            return null;
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        pics.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArrayOfImage = stream.toByteArray();
        return byteArrayOfImage;
    }

    private Bitmap byteToBitmap(byte[] bytes){
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }

    private Boolean getIfTeacherExist(ITeacher teacher){
        List<ITeacher> teachers =  getAllTeachersWithWhere(
                TeacherReaderContract.TeacherEntry.EMAIL+"='"+teacher.email +"'");
        if(teachers.size()  > 0){
            Log.d("Database", "TeacherExist: teacher already exist in the database. " + teacher.email);
            return true;
        }
        return  false;
    }

    @Override
    public boolean deleteTeacher(ITeacher teacher) {
        TeacherReaderDBHelper dbHelper = new TeacherReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(TeacherReaderContract.TeacherEntry.NAME, teacher.name);

        db.delete(TeacherReaderContract.TeacherEntry.TABLE_NAME, "_id="+teacher.id,null);
        return true;
    }

    @Override
    public List<ITeacher> getAllTeachers() {
        return getAllTeachersWithWhere("");
    }

    public List<ITeacher> getAllTeachersWithWhere(String whereText){
        TeacherReaderDBHelper dbHelper = new TeacherReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                TeacherReaderContract.TeacherEntry._ID,
                TeacherReaderContract.TeacherEntry.NAME,
                TeacherReaderContract.TeacherEntry.IMAGE,
                TeacherReaderContract.TeacherEntry.EMAIL,
                TeacherReaderContract.TeacherEntry.PHONE
        };

        Cursor cursor = db.query(
                TeacherReaderContract.TeacherEntry.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                whereText,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null              // The sort order
        );

        ArrayList<ITeacher> teachers = new ArrayList<ITeacher>();
        while(cursor.moveToNext()) {
            long itemId = cursor.getLong(cursor.getColumnIndexOrThrow(TeacherReaderContract.TeacherEntry._ID));
            String name = cursor.getString(cursor.getColumnIndexOrThrow(TeacherReaderContract.TeacherEntry.NAME));
            Bitmap image;
            try {
                image = byteToBitmap(cursor.getBlob(cursor.getColumnIndexOrThrow(TeacherReaderContract.TeacherEntry.IMAGE)));
            }catch(Exception ex){
                image = Bitmap.createBitmap(100,100,Bitmap.Config.ARGB_8888);
            }
            String email = cursor.getString(cursor.getColumnIndexOrThrow(TeacherReaderContract.TeacherEntry.EMAIL));

            String phone = cursor.getString(cursor.getColumnIndexOrThrow(TeacherReaderContract.TeacherEntry.PHONE));

            ArrayList<ISubject> subjects = getAllSubjects(itemId);
            teachers.add(new SQLTeacher(Math.toIntExact(itemId),name,image,subjects,email,phone));
        }
        cursor.close();

        return teachers;
    }

    private ArrayList<ISubject> getAllSubjects(long teacherId){
        SubjectReaderDBHelper dbHelper = new SubjectReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                SubjectReaderContract.SubjectsEntry._ID,
                SubjectReaderContract.SubjectsEntry.TEACHER_ID,
                SubjectReaderContract.SubjectsEntry.NAME,
                SubjectReaderContract.SubjectsEntry.PRICE
        };

        Cursor cursor = db.query(
                SubjectReaderContract.SubjectsEntry.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                SubjectReaderContract.SubjectsEntry.TEACHER_ID+"="+teacherId,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null              // The sort order
        );

        ArrayList<ISubject> subjects = new ArrayList<>();
        while(cursor.moveToNext()) {
            long itemId = cursor.getLong(cursor.getColumnIndexOrThrow(SubjectReaderContract.SubjectsEntry._ID));

            String name = cursor.getString(cursor.getColumnIndexOrThrow(SubjectReaderContract.SubjectsEntry.NAME));

            int price = cursor.getInt(cursor.getColumnIndexOrThrow(SubjectReaderContract.SubjectsEntry.PRICE));

            subjects.add(new SQLSubject(Math.toIntExact(itemId),Math.toIntExact(teacherId), name, price) {
            });
        }
        cursor.close();

        return subjects;
    }

    @Override
    public ITeacher getPasswordFromEmail(String email, String password) {
        List<ITeacher> teachers =  getAllTeachersWithWhere(
                TeacherReaderContract.TeacherEntry.EMAIL+"='"+email+"' AND "+
                         TeacherReaderContract.TeacherEntry.PASSWORD+"='"+SupportLogic.GetHashedPassword(password)+"'");
        if(teachers.size()  > 0){
            return teachers.get(0);
        }
// TODO :

        if(teachers.size()>1){
            Log.d("Database", "getPasswordFromEmail: Valami itt nagyon félrement, két ugyanolyan felhasználó ugyanolyan email- és jelszóval nem lehet");
        }
        else if(teachers.size() == 1){
            return teachers.get(0);
        }

        return null;
    }
}
