package com.example.diary.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diary.R;
import com.example.diary.Teacher.Friday_set;

public class Student_Authorisation extends AppCompatActivity {
    Button student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_authorisation);
        student = (Button)findViewById(R.id.student);
        final Intent student_ = new Intent(this, Friday_set.class);
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check()) {
                    startActivity(student_);
                }
            }
        });
    }

    private boolean check(){

        return  true;
    }
}
