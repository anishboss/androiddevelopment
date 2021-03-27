package com.example.testhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button btnLogin,btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail = (EditText) findViewById(R.id.etEmail);

        etPassword = (EditText) findViewById(R.id.etPassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnSignup = (Button) findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if(email.trim().isEmpty() || password.trim().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Provide email and password", Toast.LENGTH_SHORT).show();
                }else if (email.equals("admin@root.com") && password.equals("root")){
                    Intent i = new Intent(MainActivity.this,dashboard.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Congratulations", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "The credentials doesn't match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,signUp.class);
                startActivity(i);
            }
        });

    }
}