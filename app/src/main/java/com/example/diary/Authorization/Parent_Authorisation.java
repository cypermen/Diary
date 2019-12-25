package com.example.diary.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diary.R;
import com.example.diary.Teacher.Friday_set;

public class Parent_Authorisation extends AppCompatActivity {
    Button parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_authorisation);
        parent = (Button)findViewById(R.id.parent);
        final Intent parent_ = new Intent(this, Friday_set.class);
        parent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check()) {
                    startActivity(parent_);
                }
            }
        });
    }

    private boolean check(){

        return  true;
    }
}
