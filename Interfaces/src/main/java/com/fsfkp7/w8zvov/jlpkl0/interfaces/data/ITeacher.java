package com.fsfkp7.w8zvov.jlpkl0.interfaces.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public abstract class ITeacher implements Parcelable {
    /**
     * Id of the teacher in the databse
     */
    public int id;
    /**
     * Name of the teacher
     */
    public String name;
    /**
     * Image of the teacher
     */
    public Bitmap image;
    /**
     * The subjects hat the teacher can teach
     */
    public List<String> subjects;
    /**
     * The price of the lesson per hour
     */
    public int pricePerHour;
    /**
     * The email address of the teacher
     */
    public String email;
    /**
     * Phone number of the teacher
     */
    public String phoneNumber;
}
