package com.example.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Saturday_set extends AppCompatActivity {
    Button save;

    TextView subject1;
    TextView subject2;
    TextView subject3;
    TextView subject4;
    TextView subject5;
    TextView subject6;

    TextView task1;
    TextView task2;
    TextView task3;
    TextView task4;
    TextView task5;
    TextView task6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday_set);
        save = (Button)findViewById(R.id.Save);
        subject1 = (TextView)findViewById(R.id.subject1);
        subject2 = (TextView)findViewById(R.id.subject2);
        subject3 = (TextView)findViewById(R.id.subject3);
        subject4 = (TextView)findViewById(R.id.subject4);
        subject5 = (TextView)findViewById(R.id.subject5);
        subject6 = (TextView)findViewById(R.id.subject6);
        task1 = (TextView)findViewById(R.id.task1);
        task2 = (TextView)findViewById(R.id.task2);
        task3 = (TextView)findViewById(R.id.task3);
        task4 = (TextView)findViewById(R.id.task4);
        task5 = (TextView)findViewById(R.id.task5);
        task6 = (TextView)findViewById(R.id.task6);
        final Intent intent = new Intent(this, Monday.class);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("subject1", subject1.getText().toString());
                intent.putExtra("subject2", subject2.getText().toString());
                intent.putExtra("subject3", subject3.getText().toString());
                intent.putExtra("subject4", subject4.getText().toString());
                intent.putExtra("subject5", subject5.getText().toString());
                intent.putExtra("subject6", subject6.getText().toString());

                intent.putExtra("task1", task1.getText().toString());
                intent.putExtra("task2", task2.getText().toString());
                intent.putExtra("task3", task3.getText().toString());
                intent.putExtra("task4", task4.getText().toString());
                intent.putExtra("task5", task5.getText().toString());
                intent.putExtra("task6", task6.getText().toString());
                startActivity(intent);

            }
        });
    }
}
