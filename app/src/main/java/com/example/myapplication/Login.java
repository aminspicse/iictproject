package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button regbtn;
    Button loginbtn;

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        regbtn = findViewById(R.id.regButton);
        loginbtn = findViewById(R.id.loginBtn);

        username = findViewById(R.id.userName);
        password = findViewById(R.id.password);

    }

    @Override
    protected void onStart() {
        super.onStart();
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                for (int i=0; i<Register.users.size(); i++){
                    if (Register.users.get(i).getUserName().equals(user)){
                        Toast.makeText(Login.this, "Success",Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(Login.this,"Not Found",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}