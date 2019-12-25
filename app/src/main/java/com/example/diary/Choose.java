package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diary.Authorization.Parent_Authorisation;
import com.example.diary.Authorization.Student_Authorisation;
import com.example.diary.Teacher.Friday_set;

public class Choose extends AppCompatActivity {
    Button student;
    Button parent;
    Button teacher;
    Button admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        init();
        final Intent student_authorisation = new Intent(this, Student_Authorisation.class);
        final Intent parent_authorisation = new Intent(this, Parent_Authorisation.class);
        final Intent teacher_authorisation = new Intent(this, Friday_set.class);
        final Intent admin_authorisation = new Intent(this, Friday_set.class);
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(student_authorisation);
            }
        });
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(parent_authorisation);
            }
        });
         student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(teacher_authorisation);
            }
        });
         student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(admin_authorisation);
            }
        });

    }

    public void init(){
        student =(Button)findViewById(R.id.student);
        parent =(Button)findViewById(R.id.parent);
        teacher =(Button)findViewById(R.id.teacher);
        admin =(Button)findViewById(R.id.admin);
    }
}
