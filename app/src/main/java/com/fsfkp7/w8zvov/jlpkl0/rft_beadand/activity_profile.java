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

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.SubjectAdapter;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

import java.util.ArrayList;

public class activity_profile extends AppCompatActivity {

    ArrayList<ISubject> subjectList;
    TextView update_profile;
    Boolean editing_mode = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        /**
         * Display the details of the logged in teacher
         */
        ITeacher teacher = StaticTeacher.getMyTeacher();

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
    }
}
