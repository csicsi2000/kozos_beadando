package com.teacher.sqlitedatabase;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;

import java.util.List;

public class SQLiteDatabaseHandler implements IDatabaseHandler {
    @Override
    public boolean addOrEditTeacher(ITeacher teacher) {
        return false;
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
    public String getPasswordFromEmail(String email) {
        return null;
    }
}
