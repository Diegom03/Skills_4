package com.example.videos_grupo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Seguimiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "Valor informacion");
        Log.d("debug", "Valor debug");
        Log.w("warning", "Valor warning");
        Log.e("error", "Valor error");
        Log.v("verbose", "Valor verbose");

        Log.i(TAG, "Mensaje seguimiento 1");
        Log.i(TAG, "Mensaje seguimiento 2");
        Log.i(TAG, "Mensaje seguimiento 3");
    }
}