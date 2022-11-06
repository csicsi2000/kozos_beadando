package com.teacher.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.util.Log;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.teacher.sqlitedatabase.contracts.SubjectReaderContract;
import com.teacher.sqlitedatabase.contracts.TeacherReaderContract;
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
    }

    @Override
    public boolean addOrEditTeacher(ITeacher teacher) {
        TeacherReaderDBHelper dbHelper = new TeacherReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        teacher.image.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArrayOfImage = stream.toByteArray();
        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(TeacherReaderContract.TeacherEntry.NAME, teacher.name);
        values.put(TeacherReaderContract.TeacherEntry.IMAGE, BitmapToByte(teacher.image));
        values.put(TeacherReaderContract.TeacherEntry.EMAIL,teacher.email);
        values.put(TeacherReaderContract.TeacherEntry.PHONE, teacher.phoneNumber);
        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(TeacherReaderContract.TeacherEntry.TABLE_NAME, null, values);

        insertSubjects(newRowId,teacher.subjects);
        Log.d("SQLLite", "addOrEditTeacher:  " + teacher.name);

        return true;
    }

    private boolean insertSubjects(long teacherId, List<ISubject> subjects){
        SubjectReaderDBHelper dbHelper = new SubjectReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        for (ISubject subject :subjects){
            ContentValues values = new ContentValues();
            values.put(SubjectReaderContract.SubjectsEntry.TEACHER_ID, teacherId);
            values.put(SubjectReaderContract.SubjectsEntry.NAME, subject.name);
            values.put(SubjectReaderContract.SubjectsEntry.PRICE, subject.price);
            db.insert(SubjectReaderContract.SubjectsEntry.TABLE_NAME, null, values);
        }

        return true;
    }

    private byte[] BitmapToByte(Bitmap pics){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        pics.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArrayOfImage = stream.toByteArray();
        return byteArrayOfImage;
    }

    @Override
    public boolean deleteTeacher(ITeacher teacher) {
        return false;
    }

    @Override
    public List<ITeacher> getAllTeachers() {
        SubjectReaderDBHelper dbHelper = new SubjectReaderDBHelper(_context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String[] projection = {
                TeacherReaderContract.TeacherEntry._ID,
                TeacherReaderContract.TeacherEntry.NAME,
                TeacherReaderContract.TeacherEntry.PRICE,
                TeacherReaderContract.TeacherEntry.IMAGE,
                TeacherReaderContract.TeacherEntry.EMAIL,
                TeacherReaderContract.TeacherEntry.PHONE
        };

        Cursor cursor = db.query(
                TeacherReaderContract.TeacherEntry.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null              // The sort order
        );
        return null;
    }

    @Override
    public ITeacher getPasswordFromEmail(String email, String password) {
        return null;
    }
}
