package it.epicode.week1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //esercizio 1

        System.out.println("Inserisci una stringa");
        String stringa = scanner.nextLine();

        if (stringa.length() % 2 == 0){
            System.out.println("Pari");
        }else {
            System.out.println("Dispari");
        }

        System.out.println("Inserisci l'anno per scoprire se è disestile");
        int anno = scanner.nextInt();

        if (anno % 4 == 0){
            System.out.println("L'anno è bisestile");
        } else {
            System.out.println("L'anno non è bisestile");
        }


        //esercizio 2

        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();
        switch (numero){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("scelta non valida");
        }


        //esercizio 3

        String parole;

        do {
            System.out.println("Inserisci una stringa");
            parole = scanner.nextLine();
            char[] arrayString = parole.toCharArray();
            System.out.println(Arrays.toString(arrayString));
        } while (!parole.equals (":q"));



        //esercizio 4

        System.out.println("Inserisci un numero");
        int n = scanner.nextInt();
        for (int i = n; i >= 0 ; i--){
            System.out.println(i);
        }
    }


}
