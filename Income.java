package com.example.user_authentication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Income extends AppCompatActivity {
    public TextView income, extraIncome, incomeFinal;
    private Button addIncome;
    public double sum= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        income = findViewById(R.id.setIncome);
        extraIncome = findViewById(R.id.setExtraIncome);
        incomeFinal = findViewById(R.id.incomeFinal);
        addIncome = findViewById(R.id.addIncomeB2);

        addIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (income.getText().toString().length() == 0){
                    income.setText("0");
                }

                if (extraIncome.getText().toString().length() == 0){
                    extraIncome.setText("0");
                }

                double input1 = Double.parseDouble(income.getText().toString());
                double input2 = Double.parseDouble(extraIncome.getText().toString());

                sum = input1 + input2;
                incomeFinal.setText(String.valueOf("$ " +sum));
            }
        });
    }
}