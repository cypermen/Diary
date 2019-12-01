package com.example.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Diary extends AppCompatActivity {

    Button monday;
    Button tuesday;
    Button wednesday;
    Button thursday;
    Button friday;
    Button saturday;
    Button sunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);
        monday = (Button) findViewById(R.id.monday);
        tuesday = (Button) findViewById(R.id.tuesday);
        wednesday = (Button) findViewById(R.id.wednesday);
        thursday = (Button) findViewById(R.id.thursday);
        friday = (Button) findViewById(R.id.friday);
        saturday = (Button) findViewById(R.id.saturday);
        sunday = (Button) findViewById(R.id.sunday);

        final Intent intent1 = new Intent(this, Monday.class);
        final Intent intent2 = new Intent(this, Tuesday.class);
        final Intent intent3 = new Intent(this, Wednesday.class);
        final Intent intent4 = new Intent(this, Thursday.class);
        final Intent intent5 = new Intent(this, Friday.class);
        final Intent intent6 = new Intent(this, Saturday.class);
        final Intent intent7 = new Intent(this, Sunday.class);

        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent1);

            }
        });


        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent2);

            }
        });


        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent3);

            }
        });


        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent4);

            }
        });


        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent5);

            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent6);

            }
        });

        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent7);
            }
        });


    }
}
