package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tercera extends AppCompatActivity {

    private TextView tnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        tnombre = findViewById(R.id.tv_nombre);

        String Nombre = getIntent().getStringExtra("Nombre" +
                "");

        tnombre.setText(Nombre);
    }
}