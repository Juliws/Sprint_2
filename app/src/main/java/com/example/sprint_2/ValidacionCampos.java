package com.example.sprint_2;

import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.regex.*;

public class ValidacionCampos {

    public boolean formRegistros(String nombreLugar, String tipoPatrimonio, String keyWords, String keyTag, String ubicacion){
        Boolean valDato,val;
        Pattern p = Pattern.compile("[a-zA-Z ]{3,}]");
        // Pattern p = Pattern.compile(/(^[A-ZÁÉÍÓÚ]{1}([a-zñáéíóú]+){2,})(\s[A-ZÁÉÍÓÚ]{1}([a-zñáéíóú]+){2,})?$/;);
        // Pattern p = Pattern.compile("^([A-Z]{1}[a-z]+[ ]?)(1,2)$");
        // Pattern p = Pattern.compile("^([A-Z][a-z]+[ ]*)(1,){3,}$");

        ProgressBar progressBar = null;
        progressBar.setProgress(0);
        // setContentView(R.layout.hu_01);
        progressBar = progressBar.findViewById(R.id.ProgressBar);

        if (nombreLugar.isEmpty() || tipoPatrimonio.isEmpty() || keyWords.isEmpty() || keyTag.isEmpty() || ubicacion.isEmpty()){
            valDato = false;
            // Toast.makeText(this,"Ningún campo puede quedar vacio",Toast.LENGTH_SHORT).show();
        } else {
            valDato = true;
            progressBar.setProgress(1);
        }

        Matcher nl = p.matcher(nombreLugar);
        val = nl.matches();
        if (val){
            progressBar.setProgress(20);
        } else {
            // Toast.makeText(this,"Nombre de lugar invalido",Toast.LENGTH_SHORT).show();
        }
        valDato = valDato && val;

        if (tipoPatrimonio.length()<3){
            val = false;
            // Toast.makeText(this,"Tipo de patrimonio debe tener al menos tres caracteres",Toast.LENGTH_SHORT).show();
        } else {
            val = true;
            progressBar.setProgress(40);
        }
        valDato = valDato && val;

        if (keyWords.length()<3){
            val = false;
            // tusToast.makeText(this,"las palabras claves deben tener al menos tres caracteres",Toast.LENGTH_SHORT).show();
        } else {
            val = true;
            progressBar.setProgress(60);
        }
        valDato = valDato && val;

        if (keyTag.length()<3){
            val = false;
            // Toast.makeText(this,"La etiqueta clave debe tener al menos tres caracteres",Toast.LENGTH_SHORT).show();
        } else {
            val = true;
            progressBar.setProgress(80);
        }
        valDato = valDato && val;

        if (ubicacion.length()<3){
            val = false;
            // Toast.makeText(this,"La ubicacion debe tener al menos tres caracteres",Toast.LENGTH_SHORT).show();
        } else {
            val = true;
            progressBar.setProgress(100);
        }
        valDato = valDato && val;
        return valDato;
    }

    public boolean formBusqueda(String keyWords){

        return true;
    }

    public boolean formEtiqueta(String keyTag){

        return true;
    }
}
