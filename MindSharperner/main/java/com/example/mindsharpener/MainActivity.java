package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnGenerateEasy = (Button) findViewById(R.id.btnGenerateEasy);
        View btnGenerateMedium = (Button) findViewById(R.id.btnGenerateMedium);
        View btnGenerateHard = (Button) findViewById(R.id.btnGenerateHard);
        View textViewRandomNum1 = (TextView) findViewById(R.id.textViewRandomNum1);
        View textViewRandomNum2 = (TextView) findViewById(R.id.textViewRandomNum2);
        View textViewOperator = (TextView) findViewById(R.id.textViewOperator);
        View textViewAnswer = (TextView) findViewById(R.id.textViewAnswer);
        TextInputEditText UserInput = (TextInputEditText) findViewById(R.id.UserAnswer);

        btnGenerateEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Random rnd = new Random();

                int rannum1 = (rnd.nextInt(9));
                int rannum2 = (rnd.nextInt(9));
                String operator = "+";

                ((TextView)textViewRandomNum1).setText(String.valueOf(rannum1));
                ((TextView)textViewRandomNum2).setText(String.valueOf(rannum2));
                ((TextView)textViewOperator).setText(operator);

                String result = String.valueOf(rannum1 + rannum2);
                ((TextView)textViewAnswer).setText(String.valueOf(result));
            }
        });

        btnGenerateMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Random rnd = new Random();

                int rannum1 = (rnd.nextInt(99));
                int rannum2 = (rnd.nextInt(99));
                String operator = "-";

                ((TextView)textViewRandomNum1).setText(String.valueOf(rannum1));
                ((TextView)textViewRandomNum2).setText(String.valueOf(rannum2));
                ((TextView)textViewOperator).setText(operator);

                String result = String.valueOf(rannum1 - rannum2);
                ((TextView)textViewAnswer).setText(String.valueOf(result));
            }
        });

        btnGenerateHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Random rnd = new Random();

                int rannum1 = (rnd.nextInt(999));
                int rannum2 = (rnd.nextInt(999));
                String operator = "*";

                ((TextView)textViewRandomNum1).setText(String.valueOf(rannum1));
                ((TextView)textViewRandomNum2).setText(String.valueOf(rannum2));
                ((TextView)textViewOperator).setText(operator);

                String result = String.valueOf(rannum1 * rannum2);
                ((TextView)textViewAnswer).setText(String.valueOf(result));
            }
        });

        String userAnswer = String.valueOf(UserInput);


    }
}