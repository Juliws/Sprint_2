package com.example.sprint_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class hu_01 extends AppCompatActivity {

    private ImageView regresar;
    Spinner desplegable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hu_01);

        desplegable=(Spinner)findViewById(R.id.hu_01_Spinner);

        ArrayAdapter<CharSequence> opciones_Spinner_hu_01=ArrayAdapter.createFromResource(this,
                R.array.opciones_spinner_hu_01, android.R.layout.simple_spinner_item);

        desplegable.setAdapter(opciones_Spinner_hu_01);

        regresar=(ImageView)findViewById(R.id.regresar_Menu);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(hu_01.this, MainMenu.class);
                startActivity(i);
            }
        });
    }
}