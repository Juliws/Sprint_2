package com.example.sprint_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;

public class ValidacionCampos {

    public boolean formRegistros(String nombreLugar, String tipoPatrimonio, String keyWords, String keyTag, String ubicacion){
        Boolean valDato,val;
        Pattern p = Pattern.compile("[a-zA-Z ]{3,}]");

        if (nombreLugar.isEmpty() || tipoPatrimonio.isEmpty() || keyWords.isEmpty() || keyTag.isEmpty() || ubicacion.isEmpty()){
            valDato = false;

        } else {
            valDato = true;

        }

        Matcher nl = p.matcher(nombreLugar);
        val = nl.matches();

        if (val){

        } else {
            System.out.println("Nombre de lugar invalido");
        }
        valDato = valDato && val;

        if (tipoPatrimonio.length()<3){
            val = false;
            System.out.println("Tipo de patrimonio debe tener al menos tres caracteres");
        } else {
            val = true;
        }
        valDato = valDato && val;

        if (keyWords.length()<3){
            val = false;
            System.out.println("las palabras claves deben tener al menos tres caracteres");
        } else {
            val = true;

        }
        valDato = valDato && val;

        if (keyTag.length()<3){
            val = false;
            System.out.println("La etiqueta clave debe tener al menos tres caracteres");
        } else {
            val = true;
        }
        valDato = valDato && val;

        if (ubicacion.length()<3){
            val = false;
            System.out.println("La ubicacion debe tener al menos tres caracteres");
        } else {
            val = true;
        }
        valDato = valDato && val;
        return valDato;
    }

    public boolean formBusqueda(String keyWords){
        for( String s : keyWords.split(",")){
            if( s.length() < 2 || !s.matches("[A-Za-z]*")){
                return false;
            }
        }
        return true;
    }

    public boolean formEtiqueta(String keyTag){
            int codAsci = 0;

            boolean b = !(keyTag.length() == 0 || keyTag.length() < 2);
            boolean a = true;

            for (int i = 0; i < keyTag.length(); i++) {
                codAsci = (int)keyTag.charAt(i);
                if(codAsci < 48){
                    a = false;
                }
            }
            return b && a;
    }
}
