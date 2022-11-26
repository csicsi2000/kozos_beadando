package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import static androidx.core.content.ContentProviderCompat.requireContext;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Subject;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.SubjectAdapter;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;
import com.teacher.sqlitedatabase.SQLiteDatabaseHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class activity_profile extends AppCompatActivity {

    ArrayList<ISubject> subjectList;
    Button btn_update;
    ListView subject_list;
    ImageView avatar;
    ActivityResultLauncher<Intent> activityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        /**
         * Display the details of the logged in teacher
         */
        ITeacher teacher = StaticTeacher.getMyTeacher();

        ImageView profile = findViewById(R.id.ImageView_Profile);
        profile.setImageBitmap(teacher.image);

        EditText name = findViewById(R.id.EditText_Name);
        name.setText(teacher.name);

        EditText email = findViewById(R.id.EditText_Email);
        email.setText(teacher.email);

        EditText phone =findViewById(R.id.EditText_Phone);
        phone.setText(teacher.phoneNumber);

        subjectList = new ArrayList<>();

        /**
         * putting all te subjects into an arraylist
        */
        for (int i = 0; i < teacher.subjects.size(); i++){
            subjectList.add(teacher.subjects.get(i));
        }

        /**
         * Displaying subjects on activity_profile using adapters.
         */

        SubjectAdapter adapter = new SubjectAdapter(getApplicationContext(), R.layout.list_item, subjectList);
        ListView listView = findViewById(R.id.listView_subjects);
        listView.setAdapter(adapter);

        btn_update = findViewById(R.id.button_update);

        btn_update.setOnClickListener(new View.OnClickListener() {
            //updating profile
            @Override
            public void onClick(View view) {
                View v;
                subject_list = findViewById(R.id.listView_subjects);
                List<ISubject> updated_subject = new ArrayList<>();
                EditText et_sub;
                EditText et_price;
                for (int i = 0; i < subject_list.getCount(); i++)
                {
                    v = subject_list.getChildAt(i);
                    et_sub = v.findViewById(R.id.Subject);
                    et_price = v.findViewById(R.id.Price);
                    ISubject subject = new Subject(et_sub.getText().toString(),
                            Integer.parseInt(et_price.getText().toString()));
                    updated_subject.add((subject));
                }

                teacher.email = email.getText().toString();
                teacher.phoneNumber = phone.getText().toString();
                for (int j = 0; j< updated_subject.size(); j++){
                    teacher.subjects.add(updated_subject.get(j));
                }
                addTeacher(teacher);
            }
        });

        //setting up profile picture
        avatar = findViewById(R.id.ImageView_Profile);
            avatar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    activityResultLauncher.launch(intent);
                }
            });
        ContentResolver contentResolver = getContentResolver();
        activityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if(result.getResultCode() == RESULT_OK){
                            Intent intent = result.getData();
                            Uri selectedImage = intent.getData();
                            Bitmap newAvatar = null;
                            try {
                                newAvatar = MediaStore.Images.Media.getBitmap(
                                        contentResolver, selectedImage);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            avatar.setImageURI(selectedImage);
                            teacher.image = newAvatar;
                        }
                    }
                });
    }


    public void addTeacher(ITeacher tc){
        IDatabaseHandler dbHandler =  new SQLiteDatabaseHandler(getApplicationContext());
        Boolean value = dbHandler.addOrEditTeacher((tc));
        Toast.makeText(this, "Update successful", Toast.LENGTH_SHORT).show();
    }
}
