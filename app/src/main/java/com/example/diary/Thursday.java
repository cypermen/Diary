package com.example.diary;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Thursday extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String subject1;
        String subject2;
        String subject3;
        String subject4;
        String subject5;
        String subject6;
        Button change;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday);
        subject1 = getIntent().getStringExtra("subject1");
        subject2 = getIntent().getStringExtra("subject2");
        subject3 = getIntent().getStringExtra("subject3");
        subject4 = getIntent().getStringExtra("subject4");
        subject5 = getIntent().getStringExtra("subject5");
        subject6 = getIntent().getStringExtra("subject6");
        change = (Button) findViewById(R.id.button);
    }
}
