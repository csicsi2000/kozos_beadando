package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.graphics.Bitmap;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;

import java.util.List;

public class Teacher implements ITeacher {
    public Teacher(int id, String name, Bitmap image, List<String> subjects, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.subjects = subjects;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Id of the teacher in the databse
     */
    public int id;
    /**
     * Name of the teacher
     */
    String name;
    /**
     * Image of the teacher
     */
    Bitmap image;
    /**
     * The subjects hat the teacher can teach
     */
    List<String> subjects;
    /**
     * The email address of the teacher
     */
    String email;
    /**
     * Phone number of the teacher
     */
    String phoneNumber;
}
