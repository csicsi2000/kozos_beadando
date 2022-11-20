package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.R;

import java.util.ArrayList;
import java.util.List;

public class TeacherAdapter extends ArrayAdapter<ITeacher> {
    private List<ITeacher> teachers;


    public TeacherAdapter(@NonNull Context context, int resource, List<ITeacher> teachers) {
        super(context, resource, teachers);
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
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.teaching_items,parent,false);
        }

        TextView name = convertView.findViewById(R.id.Name);
        TextView email = convertView.findViewById(R.id.Email);
        TextView phoneNumber = convertView.findViewById(R.id.PhoneNumber);


        name.setText(teachers.get(position).name);
        email.setText(teachers.get(position).email);
        phoneNumber.setText(teachers.get(position).phoneNumber);


        return convertView;
    }
}
