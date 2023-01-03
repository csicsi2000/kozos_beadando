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
import java.util.regex.Pattern;

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
                List<ISubject> subjects = new ArrayList<>();
                if(subject_name.getText().toString().length()>0 && price.getText().toString().length()>0)
                {
                    ISubject subject = new Subject(subject_name.getText().toString(), Integer.parseInt(price.getText().toString()));
                    subjects.add(subject);

                }
               ITeacher teacher = null;
                try{
                    teacher = new Teacher(
                            name.getText().toString(),
                            btm,
                            subjects,
                            email.getText().toString(),
                            phone.getText().toString(),
                            password.getText().toString());

                } catch (Exception e){
                    Toast.makeText(getActivity(),"hello", Toast.LENGTH_SHORT).show();
                }


                if (checkTeacherData(teacher)){
                    Toast.makeText(getActivity(),"hello", Toast.LENGTH_SHORT).show();
                    ((activity_login) getActivity()).addTeacher(teacher);
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
            }
        });
        return view;
    }

    //could check much more things here
    public boolean checkTeacherData(ITeacher teacher){
        if (teacher.name.toString().length() < 2){
            Toast.makeText(getActivity(), "Invalid name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!((activity_login) getActivity()).isEmailAddressValid(email)) {
            Toast.makeText(getActivity(), "Invalid email", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (teacher.phoneNumber.length() < 11 || phoneNumberValidator(teacher.phoneNumber)){
            Toast.makeText(getActivity(), "Invalid phone number", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (teacher.password.length() < 6){
            Toast.makeText(getActivity(), "Too short password", Toast.LENGTH_SHORT).show();
            return false;
        }
        /*
        if (teacher.subjects.get(0).name.length() < 2){
            Toast.makeText(getActivity(), "Invalid subject", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (String.valueOf(teacher.subjects.get(0).price).length() < 3){
            Toast.makeText(getActivity(), "Invalid price", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }

    void clearInputForms(EditText text){
        text.setText("");
    }

    public boolean phoneNumberValidator(String phoneNumber){
        for (int i = 0; i < phoneNumber.length(); i++) {
            if( !Character.isDigit(i)){
                return false;
            }
        }
        /*return (phoneNumber.matches("^\\+36 \\(\\d{1,2}\\) \\d{3}\\-\\d{3,4}$"));*/
        return true;
    }
}