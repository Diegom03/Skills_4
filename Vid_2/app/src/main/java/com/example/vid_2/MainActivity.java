package com.example.vid_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evento(View view) {
        switch(view.getId()) {

            case R.id.btnEnviar:
                Intent miIntent = new Intent(MainActivity.this, MensajeActivity.class);

                Bundle miBundle = new Bundle();
                // miBundle.putString("nombre", addName.getText().toString());

                miIntent.putExtras(miBundle);

                startActivity(miIntent);
                break;
        }
    }
}