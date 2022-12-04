package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;







import androidx.navigation.ui.AppBarConfiguration;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;

import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.TeacherAdapter;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.databinding.ActivityMainBinding;
import com.teacher.sqlitedatabase.SQLiteDatabaseHandler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    SearchView searchView;
    ListView serachListview;
    ArrayList<String> list;
    ArrayAdapter<String > searchadapter;


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
        if(teacher!=null){
            signIn.setText(teacher.name+" profile");
        }

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





        TeacherAdapter teacheradapter = new TeacherAdapter(getApplicationContext(), R.layout.teaching_items, teacherlist);
        ListView listViewteacher = findViewById(R.id.listView_teachers);
        listViewteacher.setAdapter(teacheradapter);







        searchView = findViewById(R.id.searchView);
        serachListview = (ListView) findViewById(R.id.lv1);

        list = new ArrayList<>();

        for (int i = 0; i < teacherlist.size(); i++){
            list.add(teacherlist.get(i).name);
        }





        searchadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        serachListview.setAdapter(searchadapter);
        searchadapter.getFilter().filter(" ");


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    //listViewteacher.setAdapter(teacheradapter);
                    searchadapter.getFilter().filter(" ");


                    teacheradapter.getFilter().filter(query);


                }else{
                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
               searchadapter.getFilter().filter(query);
                teacheradapter.getFilter().filter(query);

               // teacheradapter.getFilter().filter(query);
                return false;
            }
        });

    }


}