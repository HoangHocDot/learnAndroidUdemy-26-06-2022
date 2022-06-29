package com.maclaurin.nvh.convertcurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    public void convertUsd(View view) {
        EditText editText = findViewById(R.id.editTextNumberDecimal);
        String amountInPounds = editText.getText().toString();
        String amountInUsd = String.format("%.2f", Double.parseDouble(amountInPounds) * 1.3)  ;
        Toast.makeText(this, amountInPounds +"£ = " + amountInUsd +"$", Toast.LENGTH_SHORT).show();

    }

        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}