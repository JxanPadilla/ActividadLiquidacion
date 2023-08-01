package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segunda extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText cargo;
    private EditText sueldoB;
    private EditText dias;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        nombre = findViewById(R.id.et_nombre);
        apellido = findViewById(R.id.et_apellido);
        cargo = findViewById(R.id.et_cargo);
        sueldoB = findViewById(R.id.et_sueldo);
        dias = findViewById(R.id.et_dias);

        Button btn_liquidar = findViewById(R.id.btnLiq);

        btn_liquidar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String Nombre = nombre.getText().toString();
                String Apellido = apellido.getText().toString();
                String Cargo = cargo.getText().toString();
                String SueldoB = sueldoB.getText().toString();
                String Dias = dias.getText().toString();

                Intent intent = new Intent(segunda.this, tercera.class);
                intent.putExtra("Nombre", Nombre);
                intent.putExtra("Apeliido", Apellido);
                intent.putExtra("Cargo", Cargo);
                intent.putExtra("SueldoB", SueldoB);
                intent.putExtra("Dias", Dias);
                startActivity(intent);
            }
        });





    }
}