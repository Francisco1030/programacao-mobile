package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class sortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
    }

    public void sortNumber(View v) {
        TextView txtResult = findViewById(R.id.text_result);
        Random gerador = new Random();
        String string = "";
        for (int i = 0; i < 10; i++) {
            string += "N "+ (i+1) + ": " + gerador.nextInt(26) + " \n";
        }

        txtResult.setText(string);

    }
}
