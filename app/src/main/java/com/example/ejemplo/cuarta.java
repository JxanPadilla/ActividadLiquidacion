package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class cuarta extends AppCompatActivity {
    private TextView tnombre;
    private TextView tcargo;
    private TextView tsueldo;
    private TextView tdias;
    private TextView tvalorDias;
    private TextView tsubTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta);

        tnombre = findViewById(R.id.tv_nombre);
        tcargo = findViewById(R.id.tv_cargo);
        tsueldo = findViewById(R.id.tv_sueldo);
        tdias = findViewById(R.id.tv_dias);
        tvalorDias = findViewById(R.id.tv_valorDias);
        tsubTotal = findViewById(R.id.tv_subTotal);

        String Nombre = getIntent().getStringExtra("Nombre" + " Apellido");
        String Cargo = getIntent().getStringExtra("Cargo");
        double SueldoB = getIntent().getDoubleExtra("SueldoB", 0.0);
        int Dias = getIntent().getIntExtra("Dias", 0);
        double ValorDias = SueldoB * Dias;

        tnombre.setText(Nombre);
        tcargo.setText(Cargo);
        tsueldo.setText(String.valueOf(SueldoB));
        tdias.setText(Dias);
        tvalorDias.setText(String.valueOf(ValorDias));
        tsubTotal.setText(Nombre);

    }
}