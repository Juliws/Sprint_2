package com.example.sprint_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class hu_03 extends AppCompatActivity{
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


// start implementation - Pendiente modificación de la instancia de la clase...

        EditText txtLabelSearch = (EditText) findViewById(R.id.txtInputSearch3);
        Button btSearch;
        btSearch = (Button) findViewById(R.id.Bt_buscar);
        btSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ValidacionCampos vc= new ValidacionCampos();
                boolean isValid= vc.formEtiqueta(txtLabelSearch.getText().toString());
                if (!isValid){
                    Toast.makeText(hu_03.this, "El campo NO debe estar vacio, debe tener como minimo dos letras y no puede contener caracteres especiales",Toast.LENGTH_LONG).show();
                }
            }
        });
// end implementation.

    }
}