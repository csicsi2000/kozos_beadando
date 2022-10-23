package com.fsfkp7.w8zvov.jlpkl0.interfaces.database;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;

import java.util.List;

public interface IDatabaseHandler {
    /**
     * If Id >= 0 then edit the teacher based on ID
     * If Id >= -1 or null, then add new Teacher
     * @param teacher
     * @return
     */
    boolean addOrEditTeacher(ITeacher teacher);

    /**
     * Delete the teacher based on ID
     * @param teacher
     * @return
     */
    boolean deleteTeacher(ITeacher teacher);

    /**
     * Returns all the teachers
     * @return
     */
    List<ITeacher> getAllTeachers();

    /**
     * Returns the hashed password based on the email adress
     * @param email
     * @return
     */
    ITeacher getPasswordFromEmail(String email,String password);
}
