package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);
// Rutina para boton categorias
        Button btnCateg = findViewById(R.id.buttonCategorias);
        btnCateg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaPrincipal.this, Categorias.class);
                startActivity(intent);
            }
        });
// Rutina para boton ESTADISTICAS
        Button btnEst = findViewById(R.id.buttonEstadisticas);
        btnEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaPrincipal.this, ConsultaEstadisticas.class);
                startActivity(intent);
            }
        });
// Rutina para boton CONSEJOS
        Button btnConsejo = findViewById(R.id.buttonConsejos);
        btnConsejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaPrincipal.this, Consejo01.class);
                startActivity(intent);
            }
        });

        // Rutina el boton REGRESAR
        Button btnSalir = findViewById(R.id.buttonRegresar);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaPrincipal.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}