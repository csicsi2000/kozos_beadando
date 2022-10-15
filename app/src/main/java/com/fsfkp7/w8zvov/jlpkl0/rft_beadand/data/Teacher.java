package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.graphics.Bitmap;

import java.util.List;

public class Teacher {
    public Teacher(String name, Bitmap image, List<String> subjects, String email, String phoneNumber) {
        this.name = name;
        this.image = image;
        this.subjects = subjects;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

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
