package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Categorias extends AppCompatActivity {
    private RadioButton r1,r2,r3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        // Rutina para seleccionar la categoria a registrar
        r1=findViewById(R.id.RadioButtonPlastico);
        r2=findViewById(R.id.RadioButtonPapel);
        r3=findViewById(R.id.RadioButtonValor);
        Button btnSeleccionar = findViewById(R.id.buttonSeleccion);
        btnSeleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()){
                    Intent intent = new Intent(Categorias.this, RegistroPlastico.class);
                    startActivity(intent);
                }
                if (r2.isChecked()){
                    Intent intent = new Intent(Categorias.this, RegistroPapel.class);
                    startActivity(intent);
                }
                if (r3.isChecked()){
                    Intent intent = new Intent(Categorias.this, RegistroDinero.class);
                    startActivity(intent);
                }
            }
        });

        // Rutina el boton REGRESAR
        Button btnBack = findViewById(R.id.buttonRegresar);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categorias.this, PantallaPrincipal.class);
                startActivity(intent);
            }
        });
    }
}