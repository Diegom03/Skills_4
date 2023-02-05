package com.example.vid_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ArrayActivity extends AppCompatActivity {

    ListView listaDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        listaDias = (ListView) findViewById(R.id.listsViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.arrayDias, android.R.layout.simple_list_item_1);

        listaDias.setAdapter(adaptador);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Selecciona: "
                        + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}