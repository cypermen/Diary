package com.example.diary.Parent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diary.R;
import com.example.diary.Teacher.Thursday_set;

public class Thursday extends AppCompatActivity {
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
        setContentView(R.layout.thursday);

        getSubjectsFromSever();
        getTasksFromSever();
        setSubjects();
        setTasks();

        final Intent thursdaySet = new Intent(this, Thursday_set.class);
        change.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(thursdaySet);
            }
        });
    }
    public void init(){
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

        change = (Button) findViewById(R.id.button);
    }

    public void getSubjectsFromSever(){
        subject1 = "";
        subject2 = "";
        subject3 = "";
        subject4 = "";
        subject5 = "";
        subject6 = "";
    }

    public void getTasksFromSever(){
        task1 = "";
        task2 = "";
        task3 = "";
        task4 = "";
        task5 = "";
        task6 = "";
    }
    public void setSubjects(){
        tvsubject1.setText(subject1);
        tvsubject2.setText(subject2);
        tvsubject3.setText(subject3);
        tvsubject4.setText(subject4);
        tvsubject5.setText(subject5);
        tvsubject6.setText(subject6);
    }

    public void setTasks(){
        tvtask1.setText(task1);
        tvtask2.setText(task2);
        tvtask3.setText(task3);
        tvtask4.setText(task4);
        tvtask5.setText(task5);
        tvtask6.setText(task6);
    }
}
