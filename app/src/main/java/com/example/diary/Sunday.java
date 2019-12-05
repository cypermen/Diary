package com.example.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sunday  extends AppCompatActivity {
    Button change;
    String subject1;
    String subject2;
    String subject3;
    String subject4;
    String subject5;
    String subject6;

    String task1;
    String task2;
    String task3;
    String task4;
    String task5;
    String task6;
    TextView tvsubject1;
    TextView tvsubject2;
    TextView tvsubject3;
    TextView tvsubject4;
    TextView tvsubject5;
    TextView tvsubject6;

    TextView tvtask1;
    TextView tvtask2;
    TextView tvtask3;
    TextView tvtask4;
    TextView tvtask5;
    TextView tvtask6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.sunday);
        tvsubject1 = (TextView)findViewById(R.id.subject1);
        tvsubject2 = (TextView)findViewById(R.id.subject2);
        tvsubject3 = (TextView)findViewById(R.id.subject3);
        tvsubject4 = (TextView)findViewById(R.id.subject4);
        tvsubject5 = (TextView)findViewById(R.id.subject5);
        tvsubject6 = (TextView)findViewById(R.id.subject6);
        tvtask1 = (TextView)findViewById(R.id.task1);
        tvtask2 = (TextView)findViewById(R.id.task2);
        tvtask3 = (TextView)findViewById(R.id.task3);
        tvtask4 = (TextView)findViewById(R.id.task4);
        tvtask5 = (TextView)findViewById(R.id.task5);
        tvtask6 = (TextView)findViewById(R.id.task6);
        subject1 = getIntent().getStringExtra("subject1");
        subject2 = getIntent().getStringExtra("subject2");
        subject3 = getIntent().getStringExtra("subject3");
        subject4 = getIntent().getStringExtra("subject4");
        subject5 = getIntent().getStringExtra("subject5");
        subject6 = getIntent().getStringExtra("subject6");
        task1 = getIntent().getStringExtra("task1");
        task2 = getIntent().getStringExtra("task2");
        task3 = getIntent().getStringExtra("task3");
        task4 = getIntent().getStringExtra("task4");
        task5 = getIntent().getStringExtra("task5");
        task6 = getIntent().getStringExtra("task6");
        change = (Button) findViewById(R.id.button);

        tvsubject1.setText(subject1);
        tvsubject2.setText(subject2);
        tvsubject3.setText(subject3);
        tvsubject4.setText(subject4);
        tvsubject5.setText(subject5);
        tvsubject6.setText(subject6);
        tvtask1.setText(task1);
        tvtask2.setText(task2);
        tvtask3.setText(task3);
        tvtask4.setText(task4);
        tvtask5.setText(task5);
        tvtask6.setText(task6);
        final Intent sundaySet = new Intent(this, Sunday_set.class);
        change.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(sundaySet);
            }
        });
    }
}
