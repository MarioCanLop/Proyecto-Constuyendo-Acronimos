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


    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num_acronimos = entrada.nextInt();
        String[] frases = new String[num_acronimos ];
        for (int i = 0 ; i < frases.length; i++){
            System.out.println(i);
            frases[i] = comprobar();

        }
        System.out.println(Arrays.toString(frases));
    }
}
