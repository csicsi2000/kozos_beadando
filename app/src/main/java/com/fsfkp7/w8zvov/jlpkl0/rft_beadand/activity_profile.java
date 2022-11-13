package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.SubjectAdapter;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

import java.util.ArrayList;

public class activity_profile extends AppCompatActivity {

    ArrayList<Subject> subjectList;
    TextView update_profile;
    Boolean editing_mode = false;
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

        subjectList = new ArrayList<>();

        /**
         * putting all te subjects into an arraylist
         */
        for (int i = 0; i < teacher.subjects.size(); i++){
            subjectList.add(teacher.subjects.get(i));
        }

        /**
         * Displaying subjects on activity_profile using adapters.
         */

        SubjectAdapter adapter = new SubjectAdapter(getApplicationContext(), R.layout.list_item, subjectList);
        ListView listView = findViewById(R.id.listView_subjects);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(), String.valueOf(adapter.getCount()), Toast.LENGTH_SHORT).show();
            }
        });

        editing_mode = false;

        update_profile = findViewById(R.id.TextView_Profile_Update);
        update_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText subject = findViewById(R.id.Subject);
                EditText price = findViewById(R.id.Price);
                EditText email = findViewById(R.id.EditText_Email);
                EditText phone = findViewById(R.id.EditText_Phone);
                TextView currency = findViewById(R.id.Currency);

                if(!editing_mode)
                {
                    editing_mode = true;
                    subject.setEnabled(true);
                    subject.setTextColor(getResources().getColor(R.color.white));
                    price.setEnabled(true);
                    price.setTextColor(getResources().getColor(R.color.white));
                    email.setEnabled(true);
                    phone.setEnabled(true);
                    currency.setTextColor(getResources().getColor(R.color.white));

                }
                else {
                    editing_mode = false;
                    subject.setEnabled(false);
                    subject.setTextColor(getResources().getColor(R.color.color2));
                    price.setEnabled(false);
                    price.setTextColor(getResources().getColor(R.color.color2));
                    email.setEnabled(false);
                    phone.setEnabled(false);
                    currency.setTextColor(getResources().getColor(R.color.color2));
                }
            }
        });

    }
}
