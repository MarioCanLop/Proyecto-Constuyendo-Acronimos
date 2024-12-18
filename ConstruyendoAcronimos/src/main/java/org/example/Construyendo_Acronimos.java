package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: Mario Cañizares López
 * @version: 1.0 (17/12/2024)
 */

public class Construyendo_Acronimos {

    public static String entrada (){ //Aquí obtenemos las frases para construir los acronimos

        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();

        return frase;
    }

    public static String comprobar(){ //esta es la frase de comprobación en la cual vemos si la frase tiene menos de 100 caracteres
        String frase_bien = "";
        String frase_mal = entrada();
        while (frase_mal.length() > 100){ //Si la frase tiene más de 100 caracteres tendra el usuario que añadirla de vuelta porque no se pueden añadir frases de mas de 100 caracteres
             frase_mal = entrada(); //llamamos al programa entráda para que nos dé la frase con menos de 100 caracteres
        }
        frase_bien = frase_mal; //Si la frase está bien se convertira en frase_bien y la devolvera al programa que le llama
        return frase_bien;
    }

    public static String formato(){ //Comprobamos el formato
        String frase_comp = comprobar();
        boolean form = frase_comp.matches("^[a-zA-Z0-9 ]*$"); //Aqui comprobamos que no hayan ninguna ñ o ningun accento debido a que la entrada debe ser en un teclado ingles

        while (form == false){ //Si el boolean es false ejecuta comprobar que a su vez vuelve a pedir una frase en el programa entrada
            frase_comp = comprobar();
            form = frase_comp.matches("^[a-zA-Z0-9 ]*$");
        }



        return frase_comp; //devolvemos la frase con todo comprobado y errores correguuidos al programa que la pidio
    }
    public static String acronimo (String frase){ //Creamos el acronimo desde esta programa

        String acronimo_ [] = frase.split("\\s+"); // Esto sirve para separar la frase por uno o más espacios y las palabras se guardan en un array
        String acron_fin = "";
        System.out.println();
        for (int i = 0; i < acronimo_.length; i++){ //Aquí vamos pasando palabra por palabra del array
            char letra = acronimo_[i].charAt(0); //Sacamos la primera letra de la palabra
            if ( Character.isUpperCase(letra)){ //Si la primera letra es mayuscual se imprime
                System.out.print(letra); //Imprime la letra del acronimo

            }
        }

        return frase;
    }

    public static void main(String[] args){ //Este es donde empieza todo

        Scanner entrada = new Scanner(System.in);
        int num_acronimos = 0;
        do{ //Para el try catch para que no salten errores
            try {
                num_acronimos = entrada.nextInt();//la cantidad de acronimos que se introducen
                String[] frases = new String[num_acronimos ]; //donde se van a guardar los acronimos
                for (int i = 0 ; i < frases.length; i++){
                    frases[i] = formato(); //recorremos el array para ir guardando las frases, se llama al programa formato que a su vez llama al programa entrada

                }
                String [] acronimos = new String[frases.length]; //Creamos esta array para crear los acronimos
                for (int i = 0; i< frases.length; i++){ //AquÍ recorremos el array creado
                    String frase = frases[i]; //guardamos la frase en el string para asi pasarla al programa
                    acronimos [i] = acronimo(frase); // llamamos al programa acronimos y lo guardamos en el array
                }
                return;
            }catch (InputMismatchException e){
                System.out.println("Introduce numeros ");
                entrada.next();
            }

        }while(true);


    }
}
