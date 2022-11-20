package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;
import com.teacher.sqlitedatabase.SQLiteDatabaseHandler;
import com.teacher.sqlitedatabase.data.SQLSubject;
import com.teacher.sqlitedatabase.data.SQLTeacher;

import java.util.ArrayList;

public class activity_login extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button;
    ITeacher teacher;
    TextView registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        password = findViewById(R.id.editText_password);
        email = findViewById(R.id.editText_email);
        button = findViewById(R.id.button_signIn);
        registration = findViewById(R.id.textView_registration);

        addTeacher();

        /**
         *onclick listener for the button_signIn
         */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isEmailAddressValid(email)){
                    Toast.makeText(activity_login.this, "Email address is not valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    teacher = getTeacherIfExist(email.getText().toString(), password.getText().toString());
                    if (teacher == null)
                        Toast.makeText(activity_login.this, "Login failed", Toast.LENGTH_SHORT).show();
                    else{
                        StaticTeacher.setMyTeacher(teacher);
                        Intent intent = new Intent(activity_login.this, activity_profile.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        //Hiding the registration fragment
        RegistrationFragment rf = new RegistrationFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        rf = (RegistrationFragment) fragmentManager.findFragmentById(R.id.registration_fragnent);
        RegistrationFragment finalRf = rf;
        showHideFragment(finalRf);


        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showHideFragment(finalRf);
            }
        });
    }

    /**
     * function to validate email address.
     */

    private boolean isEmailAddressValid(EditText email){
        String emailEntered = email.getText().toString();

        /**
         * Patterns.EMAIL_ADDRESS validates the  components of the email address
         * and checks if all three components are placed properly.
         */
        if(!emailEntered.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailEntered).matches() ){
            return true;
        }
        else{
            return false;
        }
    }



    /**
     * Checks if the teacher exist in the database.
     * If yes, returns the teacher
     * @param email
     * @param password
     * @return teacher
     */
    public ITeacher getTeacherIfExist(String email, String password){
        IDatabaseHandler dbHandler =  new SQLiteDatabaseHandler(getApplicationContext());
        ITeacher teacher = dbHandler.getPasswordFromEmail(email, password);
        if (teacher != null){
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            return teacher;
        } else{
            Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
            return  null;
        }
    }

    public void showHideFragment(final Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.setCustomAnimations(android.R.anim.fade_in,
                android.R.anim.fade_out);

        if (fragment.isHidden()) {
            ft.show(fragment);
            Log.d("hidden","Show");
        } else {
            ft.hide(fragment);
            Log.d("Shown","Hide");
        }

        ft.commit();
    }
    public void addTeacher(){
        IDatabaseHandler dbHandler =  new SQLiteDatabaseHandler(getApplicationContext());
        ITeacher teach2 = new Teacher(
                "Nagy Márk",
                null,
                new ArrayList<ISubject>(){
                    {
                        add(new Subject("Matematika",3000));
                        add(new Subject("Rajz",3000));;
                    }
                },
                "nagy@gmail.com",
                "+36703476323",
                "123"
        );

        Boolean value = dbHandler.addOrEditTeacher((teach2));
        ITeacher tc =  dbHandler.getPasswordFromEmail("nagy@gmail.com", "123");
        Toast.makeText(this, tc.phoneNumber.toString(), Toast.LENGTH_SHORT).show();
    }
}


