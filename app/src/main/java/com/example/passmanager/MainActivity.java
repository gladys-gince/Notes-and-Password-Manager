package com.example.passmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v)
    {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        String userid = username.getText().toString();
        String pass = password.getText().toString();
        if(userid.equals("brainiacs") && pass.equals("12345"))
        {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        }
        else
            {
            Toast.makeText(this, "Incorrect ID or Password", Toast.LENGTH_SHORT).show();
        }

    }
}