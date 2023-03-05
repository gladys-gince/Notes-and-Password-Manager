package com.example.passmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
    }
    public void addNote(View v){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
        Toast.makeText(this, "Note Added Successfully", Toast.LENGTH_SHORT).show();
    }
}