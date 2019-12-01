package com.example.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Registrations extends AppCompatActivity {
    Button registration2;
    TextView name2;
    TextView password2;

    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.registration);
    registration2 = (Button) findViewById(R.id.regestation2);
    name2 = (TextView) findViewById(R.id.name2);
    password2 = (TextView) findViewById(R.id.password2);
    final Intent intent = new Intent(this, Authorization.class);
    registration2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            intent.putExtra("username", name2.getText().toString());

            intent.putExtra("password", password2.getText().toString());
            startActivity(intent);

        }
    });
    }
}
