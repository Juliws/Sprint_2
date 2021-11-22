package com.example.sprint_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;

public class ValidacionCampos {

    public boolean formRegistros(String nombreLugar, String tipoPatrimonio, String keyWords, String keyTag, String ubicacion){

        return true;
    }

    public boolean formBusqueda(String keyWords){

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
