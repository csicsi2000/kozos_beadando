package com.teacher.sqlitedatabase.contracts;

import android.provider.BaseColumns;

public class SubjectReaderContract {
    private SubjectReaderContract() {}

    /* Inner class that defines the table contents */
    public static class SubjectsEntry implements BaseColumns {
        public static final String TABLE_NAME = "subjects";
        public static final String NAME = "name";
        public static final String PRICE = "price_per_hour";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + SubjectsEntry.TABLE_NAME + " (" +
                    SubjectsEntry._ID + " INTEGER PRIMARY KEY," +
                    SubjectsEntry.NAME + " TEXT," +
                    SubjectsEntry.PRICE + " INTEGER)"
            ;

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + SubjectsEntry.TABLE_NAME;

}