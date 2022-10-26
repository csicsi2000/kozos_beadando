package com.teacher.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.teacher.sqlitedatabase.contracts.TeacherReaderContract;
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
        values.put(TeacherReaderContract.TeacherEntry.PRICE, teacher.pricePerHour);
        values.put(TeacherReaderContract.TeacherEntry.SUBJECTS, ListOfStringToString(teacher.subjects));

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(TeacherReaderContract.TeacherEntry.TABLE_NAME, null, values);
        return false;
    }



    private byte[] BitmapToByte(Bitmap pics){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        pics.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArrayOfImage = stream.toByteArray();
        return byteArrayOfImage;
    }

    private String ListOfStringToString(List<String> texts){
        return String.join(separator,texts);
    }

    @Override
    public boolean deleteTeacher(ITeacher teacher) {
        return false;
    }

    @Override
    public List<ITeacher> getAllTeachers() {
        return null;
    }

    @Override
    public ITeacher getPasswordFromEmail(String email, String password) {
        return null;
    }
}
