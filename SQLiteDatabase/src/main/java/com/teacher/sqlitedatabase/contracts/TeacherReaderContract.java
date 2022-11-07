package com.teacher.sqlitedatabase.contracts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public final class TeacherReaderContract {
    private TeacherReaderContract() {}

    /* Inner class that defines the table contents */
    public static class TeacherEntry implements BaseColumns {
        public static final String TABLE_NAME = "teachers";
        public static final String NAME = "name";
        public static final String IMAGE = "image";
        public static final String EMAIL = "email";
        public static final String PHONE = "phone_number";
        public static final String PASSWORD = "password";

    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE IF NOT EXISTS " + TeacherEntry.TABLE_NAME + " (" +
                    TeacherEntry._ID + " INTEGER PRIMARY KEY," +
                    TeacherEntry.NAME + " TEXT," +
                    TeacherEntry.IMAGE + " BLOB," +
                    TeacherEntry.EMAIL + " TEXT," +
                    TeacherEntry.PHONE + " TEXT," +
                    TeacherEntry.PASSWORD + " TEXT)"

            ;

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TeacherEntry.TABLE_NAME;

}
