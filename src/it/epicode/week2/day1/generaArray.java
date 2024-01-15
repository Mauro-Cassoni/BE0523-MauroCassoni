package it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class generaArray {

    private static final Logger logger = LoggerFactory.getLogger(generaArray.class);


    public static int[] generaArray() {
        int[] intArray = new int[5];

        Random random =  new Random();

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(10)+1;
        }
        return intArray;
    }

    public static void stampaArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] modificaArray(int[] array){
        int numero = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Inserisci numero tra 1 e 5 per continuare oppure 0 per interrompere.");
                numero = scanner.nextInt();
                System.out.println("Inserisci la posizione.");
                int posizione = scanner.nextInt();

                array[posizione-1] = numero;

                stampaArray(array);
            }
            catch (ArrayIndexOutOfBoundsException ex){
                logger.error("Il numero inserito non corrisponde alla posizione dentro l'array");
                continue;
            }
            catch (InputMismatchException ex){
                logger.error("Devi inserire un numero, non una stringa");
                continue;
            }


        } while (numero != 0);

        return array;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] intArray = generaArray();

        stampaArray(intArray);

        modificaArray(intArray);





    }


}
