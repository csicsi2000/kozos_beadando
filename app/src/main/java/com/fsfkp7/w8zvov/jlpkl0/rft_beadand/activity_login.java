package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_login extends AppCompatActivity {

    EditText email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = findViewById(R.id.editText_email);
        button = findViewById(R.id.button_signIn);

        //onclick listener for the button_signIn
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isEmailAddressValid(email);
            }
        });
    }

    //function to validate email address.
    private boolean isEmailAddressValid(EditText email){
        String emailEntered = email.getText().toString();

        //Patterns.EMAIL_ADDRESS validates the  components of the email address
        //and checks if all three components are placed properly.
        if(!emailEntered.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailEntered).matches() ){
            Toast.makeText(this, "Valid email address", Toast.LENGTH_SHORT).show();
            return true;
        }
        else{
            //display an error msg if the email is invalid
            Toast.makeText(this, "Email address is not valid", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}