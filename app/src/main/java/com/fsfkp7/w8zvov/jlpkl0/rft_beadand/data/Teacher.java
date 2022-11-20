package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.graphics.Bitmap;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;

import java.util.List;


public class Teacher extends ITeacher  {

    public Teacher(String name, Bitmap image, List<ISubject> subjects, String email, String phoneNumber, String password) {
        super();
        this.id = id;
        this.name = name;
        this.image = image;
        this.subjects = subjects;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
