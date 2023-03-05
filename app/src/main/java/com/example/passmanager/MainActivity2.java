package com.example.passmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity
{
    private TextView textview;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private TextView textview5;
    private TextView textview6;
    private TextView textview7;
    int c=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview = findViewById(R.id.textView9);
        textview1 = findViewById(R.id.textView10);
        textview2 = findViewById(R.id.textView11);
        textview3 = findViewById(R.id.textView12);
        textview4 = findViewById(R.id.textView13);
        textview5 = findViewById(R.id.textView14);
        textview6 = findViewById(R.id.textView15);
        textview7 = findViewById(R.id.textView16);

        switch(c) {
            case 1: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 2: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview1.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 3: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview2.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 4: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview3.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 5: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview4.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 6: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview5.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 7: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview6.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
            case 8: {
                String userid = getIntent().getStringExtra("keyname");
                String password = getIntent().getStringExtra("password");
                String website = getIntent().getStringExtra("website");
                textview7.setText("ID is: " + userid + " Password is: " + password + "\nWebsite: " + website);
            }
            break;
        }
        c++;
    }
    public void openPass(View v){
        Intent intent = new Intent(this,AddPass.class);
        startActivity(intent);
        Toast.makeText(this, "Enter required details", Toast.LENGTH_SHORT).show();
    }
    public void openNote(View v){
        Intent intent = new Intent(this,AddNote.class);
        startActivity(intent);
        Toast.makeText(this, "Enter required details", Toast.LENGTH_SHORT).show();
    }
}