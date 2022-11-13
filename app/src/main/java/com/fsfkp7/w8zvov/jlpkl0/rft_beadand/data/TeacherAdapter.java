package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.R;

import java.util.ArrayList;
import java.util.List;

public class TeacherAdapter extends ArrayAdapter<Teacher> {
    private List<ITeacher> teachers;


    public TeacherAdapter(@NonNull Context context, int resource, List<ITeacher> teachers) {
        super(context, resource);
        this.teachers = teachers;
    }

    @Override
    public int getCount() {
        return teachers.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        EditText name = convertView.findViewById(R.id.Teacher);
        EditText email = convertView.findViewById(R.id.Teacher);
        EditText phoneNumber = convertView.findViewById(R.id.Teacher);


        name.setText(teachers.get(position).name);
        email.setText(teachers.get(position).email);
        phoneNumber.setText(teachers.get(position).phoneNumber);


        return convertView;
    }
}
