package com.example.sprint_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button hu_01,hu_02,hu_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        hu_01 = (Button)findViewById(R.id.Op_01);

        hu_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainMenu.this, hu_01.class);
                startActivity(i);
            }
        });

        hu_02 = (Button)findViewById(R.id.Op_02);
        hu_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent(MainMenu.this, hu_02.class);
                startActivity(ii);
            }
        });

        hu_03 = (Button)findViewById(R.id.Op_03);
        hu_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii= new Intent(MainMenu.this, hu_03.class);
                startActivity(iii);
            }
        });

    }

}