package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity {

    Button loginbtn, registerbtn;

    EditText username;
    EditText email;
    EditText password;

    public static List<User> users= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        loginbtn = findViewById(R.id.loginBtn);
        registerbtn = findViewById(R.id.registerbtn);

        username = findViewById(R.id.userName);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
    }

    @Override
    protected void onStart() {
        super.onStart();

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String emails = email.getText().toString();
                String passwords = password.getText().toString();

                users.add(new User(user, emails, passwords));
                Toast.makeText(Register.this, "Created", Toast.LENGTH_LONG).show();
                System.out.println(user+emails+passwords);
            }
        });


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
    }
}