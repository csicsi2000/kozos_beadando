package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.SearchAdapter;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.TeacherAdapter;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.databinding.ActivityMainBinding;
import com.teacher.sqlitedatabase.SQLiteDatabaseHandler;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;




    List<ITeacher> teacherlist;

    IDatabaseHandler databaseHandler;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ITeacher teacher = StaticTeacher.getMyTeacher();




        databaseHandler= new SQLiteDatabaseHandler(getApplicationContext());

        signIn=(Button)findViewById(R.id.SignIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(teacher==null){
                    Intent intent = new Intent(MainActivity.this,activity_login.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MainActivity.this,activity_profile.class);
                    startActivity(intent);
                }

            }
        });
       teacherlist =   databaseHandler.getAllTeachers();
       // searchList =





        TeacherAdapter adapter = new TeacherAdapter(getApplicationContext(), R.layout.teaching_items, teacherlist);
        ListView listView = findViewById(R.id.listView_teachers);
        listView.setAdapter(adapter);





      /*  SearchAdapter searchAdapter = new TeacherAdapter(getApplicationContext(), R.layout.search_list_items, searchList);
        ListView searchlistView = findViewById(R.id.SearchBox);
        searchlistView.setAdapter(searchAdapter);
        searchlistView.getOnItemClickListener= AdapterView.OnItemClickListener{parent, view, position, id ->}

       // SearchBox = (EditText) view.findViewById(R.id.SearchBox);
*/





    }
}