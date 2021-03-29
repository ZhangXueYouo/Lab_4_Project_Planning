package com.example.userauthenticationpage;
//Reference: https://www.youtube.com/watch?v=mPhqDzO7PUU
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText mUsername;
    EditText mPassword;
    EditText mConfirmPassword;
    Button mLogin;
    TextView mRegister;
    TextView mLoginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mConfirmPassword = (EditText) findViewById(R.id.confirmpassword);
        mLogin = (Button)findViewById(R.id.button);
        mRegister = (TextView) findViewById(R.id.Registered);
        mLoginText = (TextView) findViewById(R.id.login);
        mLoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(MainActivity.this,)
            }
        });
    }
}
