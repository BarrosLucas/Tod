package com.example.robo.compilador;

import android.app.IntentService;
import android.content.Intent;

class Compilador extends IntentService {

    private String[] codigoUser; //Codigo que sera formatado como o usuario digitou
    private String codigoBruto; //Codigo que vem pela chamada ("andarfrente;pegar;soltar;")
    private String enviarArduino = ""; //Codigo para o Arduino
    private int tamanhoArray=0; //Pegara a quantidade de codigos digitados pelo usuario

    public Compilador() {
        super("Compilador");
    }

    protected void onHandleIntent(Intent intent) {
        //Pega a String passada ("andarfrente;pegar;")
        String codigoBruto = (intent.getStringExtra("codigo"));

        //Quebra a String em chars
        char [] codigoSeparado= codigoBruto.toCharArray();

        //Pega a quantidade de codigos e define o tamanho do Array que contera os codigos do usuario
        for(char letra:codigoSeparado){
            if (letra == ';') {
                tamanhoArray+=1;
            }
        }
        codigoUser = new String[tamanhoArray];
        
        //Setando posições como ""
        for(int i=0;i<codigoUser.length;i++){
            codigoUser[i]="";
        }

        //Salva codigos completos no array
        int indice=0;
        for (char letra : codigoSeparado){
            if (letra != ';') {
                codigoUser[indice] += letra;
            } else indice++;

        }

        //Palavras reservadas
        String[] reservadas = new String[5];
        reservadas[0] = "andarfrente";
        reservadas[1] = "giraresquerda";
        reservadas[2] = "girardireita";
        reservadas[3] = "olhar";
        reservadas[4] = "soltar";
        reservadas[5] = "pegar";

        //Compara o codigo do usuario com as palavras reservadas e salva o comando para o arduino
        for (String comandoUser : codigoUser) {
            for (int i = 0; i < reservadas.length; i++) {
                if (comandoUser.toLowerCase().equals(reservadas[i])) {
                    enviarArduino +=i+1;
                }

            }
        }
    }
}

