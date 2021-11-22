package com.example.sprint_2;

import java.util.regex.*;

public class ValidacionCampos {

    public boolean formRegistros(String nombreLugar, String tipoPatrimonio, String keyWords, String keyTag, String ubicacion){

        return true;
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

        return true;
    }
}
