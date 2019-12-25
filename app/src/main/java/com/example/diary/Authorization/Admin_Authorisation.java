package com.example.diary.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diary.R;
import com.example.diary.Teacher.Friday_set;

public class Admin_Authorisation extends AppCompatActivity {
    Button admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_authorisation);
        admin = (Button)findViewById(R.id.student);
        final Intent admin_ = new Intent(this, Friday_set.class);
        admin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check()) {
                    startActivity(admin_);
                }
            }
        });
    }

    private boolean check(){

        return  true;
    }
}
