package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BtnCalcuadora;
    Button BtnLogin;
    Button BtnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnCalcuadora = findViewById(R.id.BtnCalcuadora);
        BtnCalcuadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Calculadora.class);
                startActivityForResult(i, 0);
            }
        });

        BtnDatos = findViewById(R.id.BtnDatos);
        BtnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Datos.class);
                startActivityForResult(i, 0);
            }
        });

        BtnLogin = findViewById(R.id.BtnLogin);
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Login.class);
                startActivityForResult(i, 0);
            }
        });
    }
}
