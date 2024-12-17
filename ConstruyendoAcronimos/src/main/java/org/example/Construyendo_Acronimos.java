package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Construyendo_Acronimos {

    public static String entrada (){

        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();

        return frase;
    }

    public static String comprobar(){
        String frase_bien = "";
        String frase_mal = entrada();
        while (frase_mal.length() > 100){
             frase_mal = entrada();
        }
        frase_bien = frase_mal;
        return frase_bien;
    }

    public static String formato(){
        String frase_comp = comprobar();
        boolean form = frase_comp.matches("^[a-zA-Z0-9 ]*$");

        while (form == false){
            frase_comp = comprobar();
            form = frase_comp.matches("^[a-zA-Z0-9 ]*$");
        }



        return frase_comp;
    }
    public static String acronimo (String frase){

        String acronimo_ [] = frase.split("\\s+");
        String acron_fin = "";
        System.out.println();
        for (int i = 0; i < acronimo_.length; i++){
            char letra = acronimo_[i].charAt(0);
            if ( Character.isUpperCase(letra)){
                System.out.print(letra);

            }
        }

        return frase;
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num_acronimos = entrada.nextInt();
        String[] frases = new String[num_acronimos ];
        for (int i = 0 ; i < frases.length; i++){
            frases[i] = formato();

        }
        String [] acronimos = new String[frases.length];
        for (int i = 0; i< frases.length; i++){
            String frase = frases[i];
            acronimos [i] = acronimo(frase);
        }
    }
}
