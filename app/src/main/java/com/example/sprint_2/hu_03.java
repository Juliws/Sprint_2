package com.example.sprint_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class hu_03 extends AppCompatActivity {

    private ImageView regresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hu_03);

        regresar=(ImageView)findViewById(R.id.regresar_Menu);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(hu_03.this, MainMenu.class);
                startActivity(i);
            }
        });

    }
    public void verificarCampos(View view){
        EditText Input_02= (EditText) findViewById(R.id.Input_02);
        ValidacionCampos vc= new ValidacionCampos();
        boolean isValid= vc.formEtiqueta(Input_02.getText().toString());
        if (isValid){
            Toast.makeText(this, "El campo no debe estar vacio, debe tener como minimo dos palabras y no puede contener caracteres especiales",Toast.LENGTH_SHORT).show();
        }
    }
}