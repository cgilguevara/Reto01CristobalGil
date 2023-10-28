package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroUsuarioNuevo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario_nuevo);

// Rutina para el boton REGISTRO USUARIO NUEVO
        Button btnRegUserNvo = findViewById(R.id.buttonLoginUsuario);
        btnRegUserNvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroUsuarioNuevo.this, PantallaPrincipal.class);
                startActivity(intent);
            }
        });

        // Rutina el boton REGRESAR
        Button btnBack = findViewById(R.id.buttonRegresar);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroUsuarioNuevo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}