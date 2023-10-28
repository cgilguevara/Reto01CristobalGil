package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroPlastico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_plastico);
// Rutina botón SELECCIONAR
        Button btnReg = findViewById(R.id.buttonSeleccion);
        btnReg.setOnClickListener(new View.OnClickListener() {
            /*  Rutinas para almacenar el dato de plástico ingresado
             */
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroPlastico.this, Categorias.class);
                startActivity(intent);
            }
        });
        // Rutina el boton REGRESAR
        Button btnBack = findViewById(R.id.buttonRegresar);
        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroPlastico.this, Categorias.class);
                startActivity(intent);
            }
        });
    }
}