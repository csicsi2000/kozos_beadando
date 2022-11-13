package com.teacher.sqlitedatabase.logic;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.teacher.sqlitedatabase.contracts.SubjectReaderContract;
import com.teacher.sqlitedatabase.contracts.TeacherReaderContract;
import com.teacher.sqlitedatabase.databasehelpers.SubjectReaderDBHelper;
import com.teacher.sqlitedatabase.databasehelpers.TeacherReaderDBHelper;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class subjectsLogic {
    private void InsertAllSubjects(int teacherId,List<ISubject> subjects, Context context){
        SubjectReaderDBHelper dbHelper = new SubjectReaderDBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<Long> subjectsId = new ArrayList<>();

        for (ISubject subject:subjects) {
            ContentValues values = new ContentValues();
            values.put(SubjectReaderContract.SubjectsEntry.TEACHER_ID, teacherId);
            values.put(SubjectReaderContract.SubjectsEntry.NAME, subject.name);
            values.put(SubjectReaderContract.SubjectsEntry.PRICE, subject.price);
            long newRowId = db.insert(TeacherReaderContract.TeacherEntry.TABLE_NAME, null, values);

            subjectsId.add(newRowId);
        }
        

// Insert the new row, returning the primary key value of the new row
    }
}
