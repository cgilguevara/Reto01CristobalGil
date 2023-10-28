package com.example.reto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Rutina para cambiar a la actividad principal con el botón "LOGIN"
        Button btnLogin = findViewById(R.id.buttonLoginUsuario);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PantallaPrincipal.class);
                startActivity(intent);
            }
        });
// Rutina para cambiar a la actividad Registro usuario nuevo con el botón "USUARIO  NUEVO"
        Button btnUsuarioNvo = findViewById(R.id.buttonRegistroUsuario);
        btnUsuarioNvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroUsuarioNuevo.class);
                startActivity(intent);
            }
        });
    }
}