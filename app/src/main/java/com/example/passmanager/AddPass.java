package com.example.passmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddPass extends AppCompatActivity
{
    private Button button;
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private TextView textView1;

    String website[]=new String[8];
    String userid[]=new String[8];
    String password[]=new String[8];
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pass);
        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);
        editText3 = findViewById(R.id.editTextTextPersonName3);
        editText4 = findViewById(R.id.editTextTextPersonName4);

        textView1 = findViewById(R.id.textView9);

        button = findViewById(R.id.button4);
                button.setOnClickListener((new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        website[i]=editText.getText().toString();
                        userid[i]=editText2.getText().toString();
                        password[i]=editText3.getText().toString();

                        Intent intent = new Intent(AddPass.this,MainActivity2.class);

                        switch(i)
                        {
                            case 1:
                                {
                                intent.putExtra("website", website[1]);
                                intent.putExtra("keyname", userid[1]);
                                intent.putExtra("password", password[1]);
                                startActivity(intent);
                            }
                            break;
                            case 2:
                            {
                                intent.putExtra("website", website[2]);
                                intent.putExtra("keyname", userid[2]);
                                intent.putExtra("password", password[2]);
                                startActivity(intent);
                            }
                            break;
                            case 3:
                            {
                                intent.putExtra("website", website[3]);
                                intent.putExtra("keyname", userid[3]);
                                intent.putExtra("password", password[3]);
                                startActivity(intent);
                            }
                            break;
                            case 4:
                            {
                                intent.putExtra("website", website[4]);
                                intent.putExtra("keyname", userid[4]);
                                intent.putExtra("password", password[4]);
                                startActivity(intent);
                            }
                            break;
                            case 5:
                            {
                                intent.putExtra("website", website[5]);
                                intent.putExtra("keyname", userid[5]);
                                intent.putExtra("password", password[5]);
                                startActivity(intent);
                            }
                            break;
                            case 6:
                            {
                                intent.putExtra("website", website[6]);
                                intent.putExtra("keyname", userid[6]);
                                intent.putExtra("password", password[6]);
                                startActivity(intent);
                            }
                            break;
                            case 7:
                            {
                                intent.putExtra("website", website[7]);
                                intent.putExtra("keyname", userid[7]);
                                intent.putExtra("password", password[7]);
                                startActivity(intent);
                            }
                            break;
                            case 8:
                            {
                                intent.putExtra("website", website[8]);
                                intent.putExtra("keyname", userid[8]);
                                intent.putExtra("password", password[8]);
                                startActivity(intent);
                            }
                            break;
                        }
                        i++;
                        //textView1.setText("ID is: "+userid[1]+" Password is: "+password[1]+"\nWebsite: "+website[1]);
                        //textView1.setText(password[1]);
                    }
                }));
    }
    public void addPass(View v)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
        Toast.makeText(this, "Password Added Successfully", Toast.LENGTH_SHORT).show();
    }
}