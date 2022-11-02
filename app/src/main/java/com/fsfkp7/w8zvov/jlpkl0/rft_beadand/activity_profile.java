package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        /**
         * Display the details of the logged in teacher
         */
        Teacher teacher = StaticTeacher.getMyTeacher();

        ImageView profile = findViewById(R.id.ImageView_Profile);
        profile.setImageBitmap(teacher.image);

        EditText name = findViewById(R.id.EditText_Name);
        name.setText(teacher.name);

        EditText email = findViewById(R.id.EditText_Email);
        email.setText(teacher.email);

        EditText phone =findViewById(R.id.EditText_Phone);
        phone.setText(teacher.phoneNumber);


    }
}