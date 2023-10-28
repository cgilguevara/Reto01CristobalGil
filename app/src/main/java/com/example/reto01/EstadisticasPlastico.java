package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EstadisticasPlastico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_plastico);

        // Rutina el boton REGRESAR
        Button btnBack = findViewById(R.id.buttonRegresar);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EstadisticasPlastico.this, ConsultaEstadisticas.class);
                startActivity(intent);
            }
        });

    }
}