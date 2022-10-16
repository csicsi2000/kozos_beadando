package com.fsfkp7.w8zvov.jlpkl0.interfaces.database;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;

import java.util.List;

public interface IDatabaseHandler {
    boolean addNewTeacher(ITeacher teacher);

    boolean editTeacher(ITeacher teacher);

    boolean deleteTeacher(ITeacher teacher);

    List<ITeacher> getAllTeachers();
}
