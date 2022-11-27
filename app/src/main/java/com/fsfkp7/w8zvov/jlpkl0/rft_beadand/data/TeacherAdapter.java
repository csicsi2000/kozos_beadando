package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
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
        ArrayList<ISubject> subjectList;
        Button btn_update;
        ListView subject_list;

        subjectList = new ArrayList<>();

        /**
         * putting all te subjects into an arraylist
*/
        for (int i = 0; i < teachers.get(position).subjects.size(); i++){
            subjectList.add(teachers.get(position).subjects.get(i));
        }

        /**
         * Displaying subjects on activity_profile using adapters.
*/

        SubjectAdapter adapter = new SubjectAdapter(convertView.getContext(), R.layout.list_item, subjectList);
        ListView listView = convertView.findViewById(R.id.listView_subjects);
        listView.setAdapter(adapter);




        TextView name = convertView.findViewById(R.id.Name);
        Button email = convertView.findViewById(R.id.Email);
        Button phoneNumber = convertView.findViewById(R.id.PhoneNumber);


        name.setText(teachers.get(position).name);
        email.setText(teachers.get(position).email);
        phoneNumber.setText(teachers.get(position).phoneNumber);




        phoneNumber.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                String number = teachers.get(position).phoneNumber;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                getContext().startActivity(intent);

            }
        });
        return convertView;
    }
}
