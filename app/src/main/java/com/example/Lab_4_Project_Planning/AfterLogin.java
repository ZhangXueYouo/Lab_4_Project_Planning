package com.example.moneytrans;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class AfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);


    }




    public void loginView(View v){ //Intent for going to Login Page
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }

    public void accountView(View v){ //Intent for going to Account Balance Page

    }

    public void transferView(View v){ //Intent for going to the Transfer Funds Page
        Intent transfer = new Intent(this, Transfer.class);
        startActivity(transfer);
    }



}
