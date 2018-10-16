package com.example.lenovo.bdsofts;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Pass;
    private TextView Info;
    private Button Login;
    private int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name =findViewById(R.id.userName);
        Pass =findViewById(R.id.passWord);
        Info =findViewById(R.id.infoMsg);
        Login =findViewById(R.id.btnLogin);

        Info.setText("No of Attempts remaining: 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Pass.getText().toString());
            }
        });
    }

    private void validate(String UserName, String PassWord){
        if (UserName.toUpperCase().equals("ADMIN") && PassWord.toUpperCase().equals("12345")){
            Activity activity =new Activity();
            Intent intent =new Intent(MainActivity.this, WeatherActivity.class);
            startActivity(intent);
        }
        else {
            counter--;
            Info.setText("UserName Or PassWord Invalid ! You are Clicked "+ String.valueOf(counter)+ " Time.");
            if (counter ==0)
            {
                Login.setEnabled(false);
            }
            //Info.setText("UserName Or PassWord Invalid !");
        }
    }
}