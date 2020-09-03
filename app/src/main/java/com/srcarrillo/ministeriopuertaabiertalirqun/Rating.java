package com.srcarrillo.ministeriopuertaabiertalirqun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Rating extends AppCompatActivity {

    private EditText inputNombre, inputComentario;
    private Button btnRatingVolver, btnEnviar;
    private RatingBar rbAyudanos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        inputNombre = findViewById(R.id.inputNombre);
        inputComentario = findViewById(R.id.inputComentario);
        btnRatingVolver = findViewById(R.id.btnRatingVolver);
        btnEnviar = findViewById(R.id.btnEnviar);
        rbAyudanos = findViewById(R.id.rbAyudanos);

        btnRatingVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Rating.this, MainActivity.class));
            }
        });

    }
    public void Enviar(View view){
        Toast.makeText(this, "Muchas Gracias Por Ayudarnos, Bendiciones", Toast.LENGTH_LONG).show();

    }
}