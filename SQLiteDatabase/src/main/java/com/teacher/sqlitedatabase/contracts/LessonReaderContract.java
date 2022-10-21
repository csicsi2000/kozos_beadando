package com.teacher.sqlitedatabase.contracts;

import android.provider.BaseColumns;

public class LessonReaderContract {
    private LessonReaderContract() {}

    /* Inner class that defines the table contents */
    public static class LessonEntry implements BaseColumns {
        public static final String TABLE_NAME = "subjects";
        public static final String TEACHER_ID = "teacher_is";
        public static final String SUBJECT_ID = "subject_id";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + LessonEntry.TABLE_NAME + " (" +
                    LessonEntry._ID + " INTEGER PRIMARY KEY," +
                    LessonEntry.TEACHER_ID + " INTEGER," +
                    LessonEntry.SUBJECT_ID + " INTEGER)"
            ;

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + LessonEntry.TABLE_NAME;

}
