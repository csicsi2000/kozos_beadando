package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent2 = getIntent();
        ITeacher teacher = getIntent().getParcelableExtra("Teacher");
        //String email = teacher.getEmail();
        Toast.makeText(this, "email", Toast.LENGTH_SHORT).show();
    }
}