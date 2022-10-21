package com.fsfkp7.w8zvov.jlpkl0.interfaces.data;

import android.graphics.Bitmap;

import java.util.List;

public interface ITeacher {
    /**
     * Id of the teacher in the databse
     */
    int id = 0;
    /**
     * Name of the teacher
     */
    public String name = null;
    /**
     * Image of the teacher
     */
    public Bitmap image = null;
    /**
     * The subjects hat the teacher can teach
     */
    public List<String> subjects = null;
    /**
     * The price of the lesson per hour
     */
    public int pricePerHour = 0;
    /**
     * The email address of the teacher
     */
    public String email = null;
    /**
     * Phone number of the teacher
     */
    public String phoneNumber = null;
}
