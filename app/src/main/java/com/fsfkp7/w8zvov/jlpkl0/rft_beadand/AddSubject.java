package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;

public class AddSubject extends AppCompatActivity {

    ImageButton imgBtn_addSubject;
    EditText newSubject;
    EditText newPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);

        ITeacher teacher = StaticTeacher.getMyTeacher();
        newSubject = findViewById(R.id.new_subject);
        newPrice = findViewById(R.id.new_price);


        imgBtn_addSubject = findViewById(R.id.imgBtn_add_subject);
        imgBtn_addSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sbj = newSubject.getText().toString();
                int prc = Integer.parseInt(newPrice.getText().toString());
                ISubject addThisSubject = new Subject(sbj,prc);
                teacher.subjects.add(addThisSubject);
                newSubject.setText("");
                newPrice.setText("");
                Intent intent = new Intent(AddSubject.this, activity_profile.class);
                startActivity(intent);
                finish();
            }
        });
    }
}