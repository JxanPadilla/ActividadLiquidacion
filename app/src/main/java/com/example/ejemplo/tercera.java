package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tercera extends AppCompatActivity {

    private TextView tnombre;
    private TextView tcargo;
    private TextView tsueldo;
    private TextView tdias;
    private TextView tvalorDias;

    private TextView tsueldoNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);
        tnombre = findViewById(R.id.tv_nombre);
        tcargo = findViewById(R.id.tv_cargo);
        tsueldo = findViewById(R.id.tv_sueldo);
        tdias = findViewById(R.id.tv_dias);
        tvalorDias = findViewById(R.id.tv_valorDias);
        tsueldoNeto = findViewById(R.id.tv_sueldoNeto);
        Button btn_sal = findViewById(R.id.btn_salj);

        btn_sal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finishAffinity();
            }
        });

        String Nombre = getIntent().getStringExtra("Nombre");
        String Apellido = getIntent().getStringExtra("Apellido");
        String Cargo = getIntent().getStringExtra("Cargo");
        int SueldoB = getIntent().getIntExtra("SueldoB", 0);
        int Dias = getIntent().getIntExtra("Dias", 0);
        String Diass = String.valueOf(Dias);
        int ValorDias = SueldoB / 30;
        int SueldoNeto = getIntent().getIntExtra("SueldoNeto", 0);

        tnombre.setText(Nombre+Apellido);
        tcargo.setText(Cargo);
        tsueldo.setText("Sueldo: "+String.valueOf(SueldoB));
        tdias.setText("Dias trabajados: "+Diass);
        tvalorDias.setText(String.valueOf("Valor por día: "+ValorDias));
        tsueldoNeto.setText("Sueldo Neto: " +SueldoNeto);

    }
}