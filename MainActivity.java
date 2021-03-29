package com.example.userauthenticationpage;
//Reference: https://www.youtube.com/watch?v=mPhqDzO7PUU
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mUsername;
    EditText mPassword;
    EditText mConfirmPassword;
    TextView mLogin;
    TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mConfirmPassword = (EditText) findViewById(R.id.confirmpassword);
        mLogin = (TextView) findViewById(R.id.login);
        mRegister = (TextView) findViewById(R.id.Registered);
        //mLogin.setOnClickListener(new View.OnClickListener());
    }
}