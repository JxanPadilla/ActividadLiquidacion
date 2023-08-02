package com.example.ejemplo;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class segunda extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText cargo;
    private EditText sueldoB;
    private EditText dias;
    private CheckBox descuento;

    private CheckBox salud;

    private CheckBox pension;



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

         descuento = findViewById(R.id.checkDescuento);
         salud = findViewById(R.id.checkSalud);
         pension = findViewById(R.id.checkPension);


        Button btn_liquidar = findViewById(R.id.btnLiq);
        Button btn_regresar = findViewById(R.id.btn_regresar);

        btn_regresar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            Intent intent = new Intent(segunda.this, MainActivity.class);
            startActivity(intent);
            }
        });

        btn_liquidar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String Nombre = nombre.getText().toString().trim();
                String Apellido = apellido.getText().toString();
                String Cargo = cargo.getText().toString();
                String Sueldo = sueldoB.getText().toString();

                String Dia = dias.getText().toString();

                Boolean Descuento = descuento.isChecked();
                Boolean Salud = salud.isChecked();
                Boolean Pension = pension.isChecked();
                int SueldoD = 0;

                  if(Nombre.isEmpty()) {
                    nombre.setError("Por favor, ingresa tu nombre");
                    nombre.requestFocus();
                    return;
                } else if(Apellido.isEmpty()) {
                    apellido.setError("Por favor, ingresa tu apellido");
                    apellido.requestFocus();
                    return;
                } else if(Cargo.isEmpty()) {
                    cargo.setError("Por favor, ingresa tu cargo");
                    cargo.requestFocus();
                    return;
                } else if(Sueldo.isEmpty()) {
                    sueldoB.setError("Por favor, ingresa tu sueldo");
                    sueldoB.requestFocus();
                    return;
                } else if(Dia.isEmpty()) {
                    dias.setError("Por favor, ingresa tu dia");
                    dias.requestFocus();
                    return;
                } else {
                      int SueldoB = Integer.parseInt(Sueldo);
                      int Dias = Integer.parseInt(Dia);
                    if(Descuento==true){
                        SueldoD += SueldoB * 0.03;
                    }if(Salud==true){
                        SueldoD += SueldoB * 0.04;
                    }if(Pension==true){
                        SueldoD += SueldoB * 0.04;
                    }

                    int SueldoNeto = SueldoB - SueldoD;


                    Intent intent = new Intent(segunda.this, tercera.class);
                    intent.putExtra("Nombre", Nombre);
                    intent.putExtra("Apellido", Apellido);
                    intent.putExtra("Cargo", Cargo);
                    intent.putExtra("SueldoB", SueldoB);
                    intent.putExtra("Dias", Dias);
                    intent.putExtra("SueldoNeto", SueldoNeto);
                    startActivity(intent);
                }




            }
        });





    }
}