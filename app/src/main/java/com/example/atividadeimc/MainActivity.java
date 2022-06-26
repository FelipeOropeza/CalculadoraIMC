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
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        double resul = n1/(n2*n2);

        if(resul > 43){
            result.setText(resul + "\nObedidade Morbida");
        }
        else if(resul > 30 && resul < 39.9){
            result.setText(resul + "\nObesidade Moderada");
        }
        else if(resul > 25 && resul < 29.9){
            result.setText(resul + "\nObesidade Leve");
        }
        else if(resul > 20 && resul < 24.9){
            result.setText(resul + "\nNormal");
        }
        else{
            result.setText(resul + "\nAbaixo do Normal");
        }
    }
    public void CalculaFe (View view){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        double resul = n1/(n2*n2);

        if(resul > 39){
            result.setText(resul + "\nObedidade Morbida");
        }
        else if(resul > 29 && resul < 38.9){
            result.setText(resul + "\nObesidade Moderada");
        }
        else if(resul > 24 && resul < 28.9){
            result.setText(resul + "\nObesidade Leve");
        }
        else if(resul > 19 && resul < 23.9){
            result.setText(resul + "\nNormal");
        }
        else{
            result.setText(resul + "\nAbaixo do Normal");
        }
    }
}