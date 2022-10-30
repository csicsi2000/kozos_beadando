package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent2 = getIntent();
        Teacher teacher = (Teacher) getIntent().getParcelableExtra("Teacher");

        TextView nameTextView = (TextView) findViewById(R.id.textView_name);
        nameTextView.setText(teacher.name);

        TextView emailTextView = (TextView) findViewById(R.id.textView_email);
        emailTextView.setText(teacher.email);
    }
}