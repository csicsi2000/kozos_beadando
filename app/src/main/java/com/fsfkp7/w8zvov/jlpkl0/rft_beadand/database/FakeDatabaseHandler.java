package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.database;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.R;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabaseHandler implements IDatabaseHandler {
    private ArrayList<ITeacher> teachers = new ArrayList<>();
    private Context _context;

    public FakeDatabaseHandler(Context context){
        _context = context;
        InitFakeDatabase();
    }

    @Override
    public boolean addOrEditTeacher(ITeacher teacher) {
        if(teacher.id >= 0){
            teachers.set(teacher.id,teacher);

        }else{
            teachers.add(teacher);
        }
        return true;
    }

    @Override
    public boolean deleteTeacher(ITeacher teacher) {
        teachers.remove(teacher.id);
        return true;
    }

    @Override
    public List<ITeacher> getAllTeachers() {
        return teachers;
    }

    @Override
    public ITeacher getPasswordFromEmail(String email, String password) {
        return new Teacher(1,
                "Második Márk",
                BitmapFactory.decodeResource(_context.getResources(),
                        R.drawable.missing),
                new ArrayList<Subject>(){
                    {
                        add(new Subject("Matematika",3000));
                    }
                },
                "MM99@gmail.com",
                "+36703476323");
    }

    private void InitFakeDatabase(){
        teachers.add(new Teacher(
                0,
                "Első Endre",
                BitmapFactory.decodeResource(_context.getResources(),
                        R.drawable.missing),
                new ArrayList<Subject>(){
                    {
                        add(new Subject("Matematika",3000));
                        add(new Subject("Magyar",13000));
                        add(new Subject("Informatika",30000));
                        add(new Subject("Agrár ismeretek",6000));
                        add(new Subject("Gazdaság tan",700));
                    }
                },
                "elsoEndre99@gmail.com",
                "+36203454323"
        ));
        teachers.add(new Teacher(
                1,
                "Második Márk",
                BitmapFactory.decodeResource(_context.getResources(),
                        R.drawable.missing),
                new ArrayList<Subject>(){
                    {
                        add(new Subject("Matematika",3000));
                    }
                },
                "MM99@gmail.com",
                "+36703476323"
        ));
        teachers.add(new Teacher(
                2,
                "További Tege",
                BitmapFactory.decodeResource(_context.getResources(),
                        R.drawable.missing),
                new ArrayList<Subject>(){
                    {
                        add(new Subject("Matematika",3000));
                        add(new Subject("Agrár ismeretek",5000));
                        add(new Subject("Matematika",3000));
                    }
                },
                "elsoEndre99@gmail.com",
                "+36203454323"
        ));
        teachers.add(new Teacher(
                3,
                "További Tege",
                BitmapFactory.decodeResource(_context.getResources(),
                        R.drawable.missing),
                new ArrayList<Subject>(){
                    {
                        add(new Subject("Matematika",3000));
                        add(new Subject("Agrár ismeretek",5000));
                        add(new Subject("Matematika",3000));
                    }
                },
                "kettesEndre99@gmail.com",
                "+36203454323"
        ));
        teachers.add(new Teacher(
                4,
                "További Tege",
                BitmapFactory.decodeResource(_context.getResources(),
                        R.drawable.missing),
                new ArrayList<Subject>(){
                    {
                        add(new Subject("Matematika",3000));
                        add(new Subject("Agrár ismeretek",5000));
                        add(new Subject("Matematika",3000));
                    }
                },
                "elsoEndre99@gmail.com",
                "+36203454323"
        ));
    }
}
