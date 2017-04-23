package com.bits.hackdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FakeLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_login);
    }

    public void secureLoginClick(View view) {
        //runs when the secure login happens
        //Toast.makeText(this,"LOGGING YOU SECURLY",Toast.LENGTH_SHORT).show();
        String userName = "";
        String password ="";
        EditText user = (EditText) findViewById(R.id.userid_text);
        userName =  user.getText().toString();

        EditText pass = (EditText) findViewById(R.id.password_text);
        password = pass.getText().toString();



        Toast.makeText(this,password,Toast.LENGTH_SHORT).show();


    }
}
