package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Authorization extends AppCompatActivity {

    String username ="";
    String userPassword = "";
    TextView name;
    TextView password;
    Button authorization;
    Button registration;
    TextView wrong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization);

        username = getIntent().getStringExtra("username");
        userPassword = getIntent().getStringExtra("password");
        name = (TextView) findViewById(R.id.name);
        password = (TextView) findViewById(R.id.password);
        wrong = (TextView) findViewById(R.id.wrong);//неверный ввод
        registration = (Button) findViewById(R.id.regestation1);
        authorization =(Button) findViewById(R.id.authorization);


        final Intent registrationIntent = new Intent(this, Registrations.class);
        final Intent diaryIntent = new Intent(this, Diary.class);


        registration.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(registrationIntent);//если нажата регистрация
            }
        });


        authorization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//если нажата авторизация(проверка имени и пороля)
                if(name.getText().toString().equals(username) && password.getText().toString().equals(userPassword)) {
                    startActivity(diaryIntent);
                }else{
                    wrong.setVisibility(View.VISIBLE);
                }

            }
        });


    }
}
