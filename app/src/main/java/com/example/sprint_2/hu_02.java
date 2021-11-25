package com.example.sprint_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class hu_02 extends AppCompatActivity {

    private ImageView regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hu_02);

            regresar=(ImageView)findViewById(R.id.regresar_Menu);
            regresar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j= new Intent(hu_02.this, MainMenu.class);
                    startActivity(j);
                }
            });

        EditText txtLabelSearch = (EditText) findViewById(R.id.txtInputSearch2);
        Button btSearch;

        btSearch = (Button) findViewById(R.id.Bt_busqueda);
        btSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ValidacionCampos vc= new ValidacionCampos();
                boolean isValid= vc.formBusqueda(txtLabelSearch.getText().toString());
                if (!isValid){
                    Toast.makeText(hu_02.this, "El campo NO debe estar vacio, debe tener como minimo dos letras y no puede contener caracteres especiales",Toast.LENGTH_LONG).show();
                }
            }
        });
// end implementation.

    }
}
