package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;
import com.teacher.sqlitedatabase.SQLiteDatabaseHandler;

import java.util.ArrayList;
import java.util.List;

public class RegistrationFragment extends Fragment {

    Button button;
    EditText name;
    EditText email;
    EditText password;
    EditText phone;
    EditText subject_name;
    EditText price;
    IDatabaseHandler dbhandler;
    public RegistrationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dbhandler = new SQLiteDatabaseHandler(getContext());
        View view = inflater.inflate(R.layout.fragment_registration,
                container, false);

        name = (EditText) view.findViewById(R.id.registration_name_input);
        email = (EditText) view.findViewById(R.id.registration_email_input);
        password = (EditText) view.findViewById(R.id.registration_password_input);
        phone   = (EditText) view.findViewById(R.id.registration_phone_input);
        subject_name = (EditText) view.findViewById(R.id.registration_subject_input);
        price = (EditText) view.findViewById(R.id.registration_subject_price_input);


        Bitmap btm = BitmapFactory.decodeResource(getResources(), R.drawable.missing);

        button = view.findViewById(R.id.button_signIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Subject subject = new Subject(subject_name.getText().toString(), Integer.parseInt(price.getText().toString()));
                List<Subject> subjects = new ArrayList<>();
                subjects.add(subject);
                ITeacher teacher = new Teacher(
                        name.getText().toString(),
                        btm,
                        subjects,
                        email.getText().toString(),
                        phone.getText().toString(),
                        password.getText().toString());
                Toast.makeText(getActivity(),subject.getName(), Toast.LENGTH_SHORT).show();
                //((activity_login) getActivity()).addTeacher(teacher);
                //dbhandler.addOrEditTeacher(teacher);

                //clearing input forms
                clearInputForms(name);
                clearInputForms(email);
                clearInputForms(phone);
                clearInputForms(password);
                clearInputForms(subject_name);
                clearInputForms(price);

                //closing the fragment.
                ((activity_login) getActivity()).showHideFragment(RegistrationFragment.this);
            }
        });
        return view;
    }

    void clearInputForms(EditText text){
        text.setText("");
    }
}