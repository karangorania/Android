package com.example.sumoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etNum1, etNum2;
Button btnSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1=(EditText)findViewById(R.id.etNum1);
        etNum2=(EditText)findViewById(R.id.etNum2);
        btnSum=(Button)findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1, num2;
                num1=etNum1.getText() .toString();
                num2=etNum2.getText() .toString();

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int sum = a + b;
                Toast.makeText(MainActivity.this, "Sum is: " + sum, Toast.LENGTH_SHORT).show();

            }


        });
    }
}