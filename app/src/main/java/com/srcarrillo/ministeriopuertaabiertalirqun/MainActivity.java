package com.srcarrillo.ministeriopuertaabiertalirqun;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private Button btnCambiar;
    private CheckBox cbNegro ;
    private CheckBox cbBlanco ;
    private CheckBox cbAzul ;
    private CheckBox cbAmarillo ;
    private CheckBox cbRojo ;
    private CheckBox cbVerde ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        btnCambiar = findViewById(R.id.btnCambiar);
        cbNegro = findViewById(R.id.cbNegro);
        cbBlanco = findViewById(R.id.cbBlanco);
        cbAzul = findViewById(R.id.cbAzul);
        cbAmarillo = findViewById(R.id.cbAmarillo);
        cbRojo = findViewById(R.id.cbRojo);
        cbVerde = findViewById(R.id.cbVerde);


    }

    public void Cambio(View view){
        if (cbNegro.isChecked()){
            txtTitulo.setTextColor(Color.BLACK);
            Toast.makeText(this, "Cambio de Color", Toast.LENGTH_SHORT).show();
        } else if (cbBlanco.isChecked()){
            txtTitulo.setTextColor(Color.WHITE);
            Toast.makeText(this, "Cambio de Color", Toast.LENGTH_SHORT).show();
        } else if (cbAzul.isChecked()){
            txtTitulo.setTextColor(Color.BLUE);
            Toast.makeText(this, "Cambio de Color", Toast.LENGTH_SHORT).show();
        } else if (cbAmarillo.isChecked()){
            txtTitulo.setTextColor(Color.YELLOW);
            Toast.makeText(this, "Cambio de Color", Toast.LENGTH_SHORT).show();
        } else if (cbRojo.isChecked()){
            txtTitulo.setTextColor(Color.RED);
            Toast.makeText(this, "Cambio de Color", Toast.LENGTH_SHORT).show();
        } else if (cbVerde.isChecked()){
            txtTitulo.setTextColor(Color.GREEN);
            Toast.makeText(this, "Cambio de Color", Toast.LENGTH_SHORT).show();
        } else {
            txtTitulo.setTextColor(Color.BLACK);
            Toast.makeText(this, "Selecciona un Color", Toast.LENGTH_SHORT).show();
        }
    }
}