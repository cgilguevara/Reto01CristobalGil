package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Consejo02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejo02);
        // Rutina para siguiente consejo
        Button btnNext = findViewById(R.id.buttonNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consejo02.this, Consejo01.class);
                startActivity(intent);
            }
        });

        // Rutina el boton REGRESAR
        Button btnSalir = findViewById(R.id.buttonRegresar);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consejo02.this, PantallaPrincipal.class);
                startActivity(intent);
            }
        });



    }
}