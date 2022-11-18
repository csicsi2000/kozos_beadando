package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.R;

import java.util.ArrayList;

public class SubjectAdapter extends ArrayAdapter<ISubject> {
    private ArrayList<ISubject> subjects;


    public SubjectAdapter(@NonNull Context context, int resource, ArrayList<ISubject> subjects) {
        super(context, resource, subjects);
        this.subjects = subjects;
    }

    @Override
    public int getCount() {
        return subjects.size();
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

        EditText editText1 = convertView.findViewById(R.id.Subject);
        EditText editText2 = convertView.findViewById(R.id.Price);

        editText1.setText(subjects.get(position).name);
        editText2.setText(String.valueOf(subjects.get(position).price));

        return convertView;
    }
}
