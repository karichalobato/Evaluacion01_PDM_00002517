package com.saenz.evaluacion01_pdm_00002517;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView nUsuario, nCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        nUsuario = findViewById(R.id.nTV_01);
        nCorreo = findViewById(R.id.nTV_02);
        Intent mIntent = getIntent();
        if(mIntent!= null){
            nUsuario.setText("Usuario: " + mIntent.getStringExtra("usuario"));
            nCorreo.setText("Correo: " + mIntent.getStringExtra("correo"));
        }

    }
}
