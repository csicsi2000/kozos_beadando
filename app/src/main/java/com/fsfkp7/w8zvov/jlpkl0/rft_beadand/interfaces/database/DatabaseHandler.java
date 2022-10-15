package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.interfaces.database;

import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

import java.util.List;

public interface DatabaseHandler {
    /**
     *  This method adds the new Teacher. The id should be -1
     * @param teacher
     * @return true if successful
     */
    boolean addNewTeacher(Teacher teacher);

    /**
     * This method edits the existing data of the given Teacher.
     * It will update the data based on the id
     * @param teacher
     * @return true if successful
     */
    boolean editTeacher(Teacher teacher);

    /**
     * Deletes the teacher based on the teachers id
     * @param teacher
     * @return true if successful
     */
    boolean deleteTeacher(Teacher teacher);

    /**
     * Get all the teachers from the database
     * @return
     */
    List<Teacher> getAllTeachers();
}
