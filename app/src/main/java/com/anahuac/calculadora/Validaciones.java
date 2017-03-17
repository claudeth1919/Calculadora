package com.anahuac.calculadora;

import android.widget.TextView;

/**
 * Created by ivan.diaza26 on 03/02/2017.
 */

public  final class Validaciones {
    public static  final void limpiarSiEstaLlena(TextView entrada){
        if(entrada.getText().length()==9){
            entrada.setText("");
        }
    }

    public static final String checarResultado(double a, double b, char operador){
        double resultado=0;
        switch (operador){
            case '+':
                resultado = a + b;
            break;
            case '-':
                resultado = a - b;
            break;
            case '%':
                if(b==0){
                    return "Math ERROR";
                }else{
                    resultado = a / b;
                }
                break;
            case 'x':
                resultado = a * b;
            break;
        }
        int tempInteger = (int) resultado;
        double parteDecimal = resultado -tempInteger;
        String cadenaResultado="";
        if(parteDecimal==0.0){
            cadenaResultado= tempInteger+"";
        }else{
            cadenaResultado= resultado+"";
        }
        return cadenaResultado;
    }

    public static void checarHayPalabras(TextView entrada){
        if(entrada.getText().toString().compareTo("Math ERROR")==0){
            entrada.setText("");
        }else if(entrada.getText().toString().compareTo("Syntax ERROR")==0){
            entrada.setText("");
        }
    }

    public static void checarSiNoHayCerosIzquierda(TextView entrada){
        double temp = 0;
        try{
            temp = Double.valueOf(entrada.getText().toString());
            int tempInteger = (int) temp;
            double parteDecimal = temp -tempInteger;
            if(parteDecimal==0.0){
                entrada.setText(tempInteger+"");
            }else{
                entrada.setText(temp+"");
            }

        }catch (NumberFormatException e){
            System.out.println("Hubo un error");
        }
    }

    public static double checarSiEsNumeroValido(TextView entrada){
        double temp=0;
        try {
            temp= Double.valueOf(entrada.getText().toString());
        }catch (NumberFormatException e){
            System.out.println("Hubo un error");
        }
        return temp;
    }

    public static String checarSiAuxTieneMensaje(String aux,TextView entradaHistorica){
        if(aux.compareTo("Math ERROR")==0 || aux.compareTo("Infinity")==0 ){
            entradaHistorica.setText("");
            return "";
        }else{
            return aux;
        }
    }

    public boolean prueba(Object obj) {
        return true;
    }
}
