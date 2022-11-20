package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
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
import java.util.List;

public class activity_profile extends AppCompatActivity {

    ArrayList<ISubject> subjectList;
    Button btn_update;
    ListView subject_list;

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

        btn_update = findViewById(R.id.button_update);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View v;
                subject_list = findViewById(R.id.listView_subjects);
                List<Subject> updated_subject = new ArrayList<Subject>();
                EditText et_sub;
                EditText et_price;
                for (int i = 0; i < subject_list.getCount(); i++)
                {
                    v = subject_list.getChildAt(i);
                    et_sub = v.findViewById(R.id.Subject);
                    et_price = v.findViewById(R.id.Price);
                    Subject subject = new Subject(et_sub.getText().toString(),
                            Integer.parseInt(et_price.getText().toString()));
                    updated_subject.add((subject));
                }

                ITeacher updated_teacher = new Teacher(
                        teacher.name,
                        teacher.image,
                        updated_subject,
                        email.getText().toString(),
                        phone.getText().toString(),
                        teacher.password
                );
            }
        });
    }
}
