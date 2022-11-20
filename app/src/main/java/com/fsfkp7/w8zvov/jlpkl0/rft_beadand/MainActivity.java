package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.databinding.ActivityMainBinding;
import com.teacher.sqlitedatabase.SQLiteDatabaseHandler;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;


    EditText name;
    EditText password;
    EditText subject;


    Button button;



    Teacher teacher;
    EditText teachername;

    List<ITeacher> teacherlist;

    IDatabaseHandler databaseHandler;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHandler= new SQLiteDatabaseHandler(getApplicationContext());

        signIn=(Button)findViewById(R.id.SignIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,activity_login.class);
                startActivity(intent);
            }
        });
       teacherlist =   databaseHandler.getAllTeachers();




     //   TeacherAdapter adapter = new TeacherAdapter(getApplicationContext(), R.layout.teaching_items, teacherlist);
      //  ListView listView = findViewById(R.id.listView_teachers);
        //listView.setAdapter(adapter);

        //setSupportActionBar(binding.appBarMain.toolbar);
        // binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {

        // Teacher teacher = StaticTeacher.getMyTeacher();

        //   ImageView profile = findViewById(R.id.ImageView_Profile);
        // profile.setImageBitmap(teacher.image);

        //  EditText name = findViewById(R.id.EditText_Name);
        // name.setText(teacher.name);

        //   EditText email = findViewById(R.id.EditText_Email);
        // email.setText(teacher.email);

        //   EditText phone =findViewById(R.id.EditText_Phone);
        //  phone.setText(teacher.phoneNumber);

        //subjectList = new ArrayList<>();

        // teachername = findViewById(R.id.editText_teacher);
        // button = findViewById(R.id.button_signIn);

      //  for (int i = 0; i < teacher.subjects.size(); i++) {
      //      subjectList.add(teacher.subjects.get(i));
       // }


    }
}