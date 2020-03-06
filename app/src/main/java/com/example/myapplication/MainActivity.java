package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateText(View v) {
        TextView txtResult = findViewById(R.id.txt_result);
        EditText edtName = findViewById(R.id.edt_name);
        txtResult.setText(edtName.getText());
    }

    public void newText(View v) {
        Intent intent = new Intent(this, sortActivity.class);
        startActivity(intent);
    }

}
