package com.fsfkp7.w8zvov.jlpkl0.interfaces.data;

import android.graphics.Bitmap;
import android.os.Parcelable;

import java.util.List;

public interface ITeacher extends Parcelable {
    /**
     * Id of the teacher in the databse
     */
    int id = 0;
    /**
     * Name of the teacher
     */
    String name = null;
    /**
     * Image of the teacher
     */
    Bitmap image = null;
    /**
     * The subjects hat the teacher can teach
     */
    List<String> subjects = null;
    /**
     * The price of the lesson per hour
     */
    int pricePerHour = 0;
    /**
     * The email address of the teacher
     */
    String email = null;
    /**
     * Phone number of the teacher
     */
    String phoneNumber = null;
}
