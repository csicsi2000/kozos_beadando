package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;

import java.util.List;

public class Teacher implements ITeacher, Parcelable {
    public Teacher(int id, String name, Bitmap image, List<Subject> subjects,String email, String phoneNumber) {
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
    List<Subject> subjects;
    /**
     * The email address of the teacher
     */
    String email;
    /**
     * Phone number of the teacher
     */
    String phoneNumber;

    protected Teacher(Parcel in) {
        id = in.readInt();
        name = in.readString();
        image = in.readParcelable(Bitmap.class.getClassLoader());
        email = in.readString();
        phoneNumber = in.readString();
    }

    public static final Creator<Teacher> CREATOR = new Creator<Teacher>() {
        @Override
        public Teacher createFromParcel(Parcel in) {
            return new Teacher(in);
        }

        @Override
        public Teacher[] newArray(int size) {
            return new Teacher[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeParcelable(image, i);
        parcel.writeString(email);
        parcel.writeString(phoneNumber);
    }
}
