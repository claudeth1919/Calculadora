package com.anahuac.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    protected boolean puedeSerNumero = true;
    protected boolean puedeSerOperador = false;

    public TextView entrada;
    public TextView entradaHistorica;
    protected Button btn0;
    protected Button btn1;
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;
    protected Button btn5;
    protected Button btn6;
    protected Button btn7;
    protected Button btn8;
    protected Button btn9;
    protected Button btnMas;
    protected Button btnMenos;
    protected Button btnEntre;
    protected Button btnPor;
    protected Button btnIgual;
    protected Button btnPunto;
    protected Button btnC;
    protected Button btnCE;
    protected Button btnDEL ;

    protected Button btnAux ;
    protected Button BtnMmas ;
    protected Button btnMmenos ;
    protected Button BtnMInsertar ;
    protected Button BtnMClear ;
    protected Button BtnRecuperar ;

    protected final int ceroPorDefecto=0;


    public double valor1=0;
    public double valor2=0;

    public double valorEnMemoria=0;

    public String resultado="";
    public String aux="";
    public char operador=' ';
    public Boolean hayUnResultadoDeLoAnterior;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnEntre = (Button) findViewById(R.id.btnEntre);
        btnPor = (Button) findViewById(R.id.btnPor);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnC = (Button) findViewById(R.id.btnC);
        btnCE = (Button) findViewById(R.id.btnCE);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnDEL = (Button) findViewById(R.id.btnDEL);

        btnAux = (Button) findViewById(R.id.btnAux);
        BtnMmas = (Button) findViewById(R.id.btnMmas);
        btnMmenos = (Button) findViewById(R.id.btnMmenos);
        BtnMInsertar = (Button) findViewById(R.id.btnMS);
        BtnMClear = (Button) findViewById(R.id.btnMC);
        BtnRecuperar = (Button) findViewById(R.id.btnMR);

        btnAux.setEnabled(false);
//        BtnMmas.setEnabled(false);
//        BtnMenos.setEnabled(false);
        BtnMClear.setEnabled(false);
        BtnRecuperar.setEnabled(false);

        hayUnResultadoDeLoAnterior=false;


        entrada= (TextView) findViewById(R.id.display);
        entradaHistorica = (TextView) findViewById(R.id.historico);

        entrada.setText(ceroPorDefecto+"");

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("0");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("0");
//                    Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                    Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }


            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("1");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("1");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("2");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("2");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("3");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("3");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }

            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("4");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("4");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("5");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("5");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("6");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("6");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("7");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("7");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }

            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("8");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("8");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().length()<9){
                    aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                    Validaciones.checarHayPalabras(entrada);
                    puedeSerOperador = true;
                    if(hayUnResultadoDeLoAnterior){
                        entrada.setText("9");
                        entradaHistorica.setText("");
                        hayUnResultadoDeLoAnterior = false;
                    }else{
                        entrada.append("9");
                        Validaciones.checarSiNoHayCerosIzquierda(entrada);
//                        Validaciones.limpiarSiEstaLlena(entrada);
                    }
                }
            }
        });


        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                Validaciones.checarHayPalabras(entrada);
                if(puedeSerOperador){
                    puedeSerOperador = false;
                    operador = '+';
                    valor1= Validaciones.checarSiEsNumeroValido(entrada);
                    entrada.setText("");
                    entradaHistorica.setText(valor1+"");
                    entradaHistorica.append("+");
                    if(hayUnResultadoDeLoAnterior)hayUnResultadoDeLoAnterior = false;
                }
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                Validaciones.checarHayPalabras(entrada);
                if(puedeSerOperador&&!(entrada.getText().toString().compareTo("0")==0)){
                    puedeSerOperador = false;
                    operador = '-';
                    valor1= Validaciones.checarSiEsNumeroValido(entrada);
                    entrada.setText("");
                    entradaHistorica.setText(valor1+"");
                    entradaHistorica.append("-");
                    if(hayUnResultadoDeLoAnterior)hayUnResultadoDeLoAnterior = false;
                }else if(entrada.getText().toString().isEmpty()||entrada.getText().toString().compareTo("0")==0){
                    entrada.setText("-");
                    hayUnResultadoDeLoAnterior = false ; //Prueba
                }
            }
        });

        btnEntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                Validaciones.checarHayPalabras(entrada);
                if(puedeSerOperador){
                    puedeSerOperador = false;
                    operador = '%';
                    valor1= Validaciones.checarSiEsNumeroValido(entrada);
                    entrada.setText("");
                    entradaHistorica.setText(valor1+"");
                    entradaHistorica.append("%");
                    if(hayUnResultadoDeLoAnterior)hayUnResultadoDeLoAnterior = false;
                }
            }
        });

        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aux = Validaciones.checarSiAuxTieneMensaje(aux, entradaHistorica);
                Validaciones.checarHayPalabras(entrada);

                if(puedeSerOperador){
                    puedeSerOperador = false;
                    operador = 'x';
                    valor1= Validaciones.checarSiEsNumeroValido(entrada);
                    entradaHistorica.setText(valor1+"");
                    entrada.setText("");
                    entradaHistorica.append("x");
                    if(hayUnResultadoDeLoAnterior)hayUnResultadoDeLoAnterior = false;
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean valiarBotonIgual=true;
                try {
                    valor2 = Double.valueOf(entrada.getText().toString());
                }catch (NumberFormatException e){
                    System.out.println("Hubo un error");
                    valiarBotonIgual=false;
                }
                if(valiarBotonIgual&&(operador!=' ')){
                    entrada.setText("");
                    if(operador=='-'&&(valor2<0)){
                        entradaHistorica.append("( "+valor2+" )");
                    }else{
                        entradaHistorica.append(valor2+"");
                    }
                    aux=Validaciones.checarResultado(valor1,valor2,operador);
                    entrada.setText(aux);
                    if(aux.compareTo("Math ERROR")==0 ){
                        aux="0";
                    }
                    operador=' ';
                    btnAux.setEnabled(true);
                    hayUnResultadoDeLoAnterior=true;
                }
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    entrada.setText(ceroPorDefecto+"");
                    if(operador==' '){
                        valor1 = 0;
                        valor2 = 0;
                        entradaHistorica.setText("");
                    }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrada.setText(ceroPorDefecto+"");
                entradaHistorica.setText("");
                valor1 = 0;
                valor2 = 0;
                hayUnResultadoDeLoAnterior = false ; //Prueba
//                aux="";
            }
        });

        btnDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayUnResultadoDeLoAnterior = false ; //Prueba
                String entradaActual = entrada.getText().toString();
                if(entradaActual.length()>0){
                    String quitarUnCaracter =  entradaActual.substring(0,(entradaActual.length()-1));
                    entrada.setText(quitarUnCaracter);
                }else if(entradaActual.length()==0){
                    entrada.setText(ceroPorDefecto+"");
                }

            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().indexOf('.')==-1){
                    entrada.append(".");
                }
                Validaciones.limpiarSiEstaLlena(entrada);
            }
        });

        btnAux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entrada.getText().toString().compareTo("Math ERROR")==0) aux="0";
                entrada.setText(aux+"");
                if(hayUnResultadoDeLoAnterior) entradaHistorica.setText("");
                hayUnResultadoDeLoAnterior=true;
            }
        });

        BtnMInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEnMemoria= Validaciones.checarSiEsNumeroValido(entrada);
                BtnRecuperar.setEnabled(true);
                BtnMClear.setEnabled(true);
            }
        });

        BtnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entradaHistorica.setText("");
                entrada.setText(valorEnMemoria+"");
                hayUnResultadoDeLoAnterior=true;
            }
        });

        BtnMmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorActual=Validaciones.checarSiEsNumeroValido(entrada);
                valorEnMemoria +=  valorActual;
                BtnRecuperar.setEnabled(true);
                BtnMClear.setEnabled(true);
            }
        });

        btnMmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorActual=Validaciones.checarSiEsNumeroValido(entrada);
                valorEnMemoria -=  valorActual;
                BtnRecuperar.setEnabled(true);
                BtnMClear.setEnabled(true);
            }
        });

        BtnMClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BtnMClear.setEnabled(false);
                BtnRecuperar.setEnabled(false);
                valorEnMemoria = 0;
            }
        });

    }


}
