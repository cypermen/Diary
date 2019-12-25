package com.example.diary.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diary.R;
import com.example.diary.Teacher.Friday_set;

public class Teacher_Authorisation extends AppCompatActivity {
    Button teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_authorisation);
        teacher = (Button)findViewById(R.id.teacher);
        final Intent teacher_ = new Intent(this, Friday_set.class);
        teacher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check()) {
                    startActivity(teacher_);
                }
            }
        });
    }

    private boolean check(){

        return  true;
    }
}
