package com.example.sprint_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hu_01 extends AppCompatActivity {

    private ImageView regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hu_01);

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