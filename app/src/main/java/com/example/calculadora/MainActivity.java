package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextNum1, editTextNum2;
    TextView textViewresulsuma, textViewresultmultiplica;
    Button buttontotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);
        textViewresulsuma = (TextView) findViewById(R.id.textViewresulsuma);
        textViewresultmultiplica = (TextView) findViewById(R.id.textViewresultmultiplica);
        buttontotal = (Button) findViewById(R.id.buttontotal);
        buttontotal.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        float n1, n2, res, resul;
        n1 = Float.parseFloat(editTextNum1.getText().toString());
        n2 = Float.parseFloat(editTextNum2.getText().toString());
        res = n1 + n2;
        resul = n1 * n2;
        textViewresulsuma.setText("la suma es " + res);
        Toast.makeText(getApplicationContext(), "la suma es " + res, Toast.LENGTH_LONG).show();
        textViewresultmultiplica.setText("la multiplicacion es " + resul);
        Toast.makeText(getApplicationContext(), "la suma es " + resul, Toast.LENGTH_LONG).show();

    }
}