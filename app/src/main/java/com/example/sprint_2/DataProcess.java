package com.example.sprint_2;

import java.util.Locale;

public class DataProcess {

    public String generadorEtiqueta(String nombreLugar, String tipoPatrimonio){
        nombreLugar.toUpperCase(Locale.ROOT);

        String etiqueta=null;
        int consecutivo1=1002;


        if(tipoPatrimonio == "Patrimonio Mueble"){
            etiqueta= nombreLugar+" PM "+consecutivo1;
            consecutivo1=consecutivo1+1;
        }else{
            etiqueta=nombreLugar+" PI "+consecutivo1;
        }
        return etiqueta;
    }

    public int contadorKeyWord(String keyWords){
        int contador=0;

        for( String s : keyWords.split(",")){
            contador= contador+1;
        }
        return contador;
    }
}

