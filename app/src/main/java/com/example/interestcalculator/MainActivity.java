package com.example.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit1;
    private EditText edit2;
    private TextView resultTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        resultTV = (TextView) findViewById(R.id.Result);
    }

    public void btndown(View view) {
        float n1 = Float.parseFloat(edit1.getText().toString());
        float n2 = Float.parseFloat(edit2.getText().toString());
        if(n2 > 100){
            resultTV.setText("Invalid");
        }
        else {
            float down = n1 * (100 - n2) / 100;
            resultTV.setText(String.valueOf(down));
        }
    }

    public void btnup(View view) {
        float n1 = Float.parseFloat(edit1.getText().toString());
        float n2 = Float.parseFloat(edit2.getText().toString());

        float up = n1 * (100 + n2) / 100;
        resultTV.setText(String.valueOf(up));

    }
}