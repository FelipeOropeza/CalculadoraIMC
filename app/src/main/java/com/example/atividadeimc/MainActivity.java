package com.example.atividadeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.txtnum2);
        result = findViewById(R.id.txtresult);
    }
    EditText num1, num2;
    TextView result;
    double n1, n2;

    public void Calcula (View view){
        n1 = Double.parseDouble()
    }
}