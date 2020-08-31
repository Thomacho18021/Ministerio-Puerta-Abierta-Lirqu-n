package com.srcarrillo.ministeriopuertaabiertalirqun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private Button btnIniciar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciar = findViewById(R.id.btnIniciar);
    }

    public void Saludar(){

    }
}