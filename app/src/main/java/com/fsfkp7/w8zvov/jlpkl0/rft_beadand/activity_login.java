package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.database.FakeDatabaseHandler;

public class activity_login extends AppCompatActivity {

    EditText email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = findViewById(R.id.editText_email);
        button = findViewById(R.id.button_signIn);

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
                    isLoginValid();
                }
            }
        });
    }
/*
    private void test(){
        IDatabaseHandler databaseHandler = FakeDatabaseHandler();
        ITeacher teacher = databaseHandler.getTeacherFromLogin();
        if(teacher == null){

        }

        // másik activty(teacher)
    }*/

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

    public boolean isLoginValid(){
        IDatabaseHandler dbHandler = new FakeDatabaseHandler(getBaseContext());
        /**
         * conect and check
         */
        return true;

    }
}