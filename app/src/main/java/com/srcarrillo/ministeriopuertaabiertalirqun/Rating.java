package com.srcarrillo.ministeriopuertaabiertalirqun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail(inputNombre.getText().toString()+":\n"+inputComentario.getText().toString()+"\n"+rbAyudanos.getRating());
            }
        });

    }
    public void enviarEmail(String mensaje){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);


        String mailto = "mailto:ThomasCarrilloGonzalez@gmail.com" +
                "?cc=" + "ThomasCarrilloGonzalez@gmail.com" +
                "&body=" + Uri.encode(mensaje);

        emailIntent.setData(Uri.parse(mailto));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "thomascarrillogonzalez@gmail.com"); // * configurar email aquí!
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "App Ministerio Puerta Abierta - Opinión");
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email."));
            Log.i("EMAIL", "Muchas Gracias por ayudarnos, Bendiciones");
        }
        catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(this, "NO existe ningún cliente de email instalado!.", Toast.LENGTH_SHORT).show();
        }

    }
}
