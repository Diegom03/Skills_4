package com.example.vid_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        mensaje = (TextView) findViewById(R.id.txtNombreMensaje);

        Bundle miBundle = this.getIntent().getExtras();

        if(miBundle != null) {
            String nombre = miBundle.getString("nombre");
            mensaje.setText("Bienvenido: " + nombre);
        }
    }

    public void onclick(View view) {
        finish();
    }
}