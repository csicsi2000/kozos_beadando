package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.database;

import android.content.Context;

import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.interfaces.database.DatabaseHandler;

import java.util.List;

public class FakeDatabaseHandler implements DatabaseHandler {
    public FakeDatabaseHandler(Context context){
        
    }

    @Override
    public boolean addNewTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public boolean editTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public boolean deleteTeacher(Teacher teacher) {
        return false;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }
}
