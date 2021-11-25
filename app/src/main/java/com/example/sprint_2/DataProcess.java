package com.example.sprint_2;

public class DataProcess {

    private int nroCons = 1002;

    public String generadorEtiqueta(String nombreLugar, String tipoPatrimonio){

        String lugar = nombreLugar.toUpperCase();
        String etiqueta=null;

        lugar = lugar.substring(0, 3);

        if (tipoPatrimonio.isEmpty() || nombreLugar.isEmpty()){
            return "Tiene campos vacíos";
            }else{

                if(tipoPatrimonio == "Patrimonio Mueble"){
                    etiqueta=lugar+"PM"+String.valueOf(nroCons);

                }else{
                    etiqueta=lugar+"PI"+String.valueOf(nroCons);
                }
                nroCons = nroCons + 1;
                return etiqueta;
        }
    }

    public int contadorKeyWord(String keyWords){
        int contador=0;

        for( String s : keyWords.split(",")){
            contador= contador+1;
        }
        return contador;
    }
}

