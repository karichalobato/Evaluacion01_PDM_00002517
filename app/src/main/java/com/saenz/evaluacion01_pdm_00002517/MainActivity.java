package com.saenz.evaluacion01_pdm_00002517;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button bt_enviar;
    private EditText mUsuario, mCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsuario = findViewById(R.id.Edit_text1);
        mCorreo = findViewById(R.id.Edit_text2);
        bt_enviar = findViewById(R.id.btn_enviar);
        bt_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = mUsuario.getText().toString();
                String correo = mCorreo.getText().toString();
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
                mIntent.putExtra("usuario", usuario);
                mIntent.putExtra("correo", correo);
                MainActivity.this.startActivity(mIntent);
            }
        });
    }


}
