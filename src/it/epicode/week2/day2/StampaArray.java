package it.epicode.week2.day2;

import it.epicode.week1.day3.PrimoEsercizio;

import java.util.*;

public class StampaArray {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        // stampaArray();
        intCasualiOrdinati();

    }


    // Esercizio 1
    public static void stampaArray(){
        HashSet<String> parole = new HashSet<>();
        HashSet<String> doppioni = new HashSet<>();


        System.out.println("schegli il numero di parole da inserire");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("inserisci la parola n." + (i+1));
            String p = scanner.nextLine();
            if (!parole.add(p)) {
                doppioni.add(p);
            }
            parole.add(p);
        }

        System.out.println(doppioni);

        System.out.println(doppioni.size());

        System.out.println(parole);

    }




    // Esercizio 2
    public static ArrayList<Integer> intCasualiOrdinati(){
        Random random =  new Random();
        ArrayList<Integer> numeri = new ArrayList<>();

        System.out.println("schegli quanti numeri casuali vuoi visualizzare");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numeri.add(random.nextInt(101));
        }
        Collections.sort(numeri);
        System.out.println(numeri);

        invertiOrdinata(numeri);
        System.out.println("scegli un bolleano");
        Boolean bool = scanner.nextBoolean();
        pariODispari(numeri,bool);

        return numeri;

    }

    public static ArrayList<Integer> invertiOrdinata(ArrayList<Integer> array){
        ArrayList<Integer> nuovoArray = new ArrayList<>();
        for (int n:array){
            nuovoArray.add(n);
        }
        Collections.reverse(array);
        for (int n:array){
            nuovoArray.add(n);
        }
        System.out.println(nuovoArray);
        return nuovoArray;
    }

    public static void pariODispari(ArrayList<Integer> array, boolean bool){


        for (int i = bool ? 0 : 1 ; i < array.size(); i+=2) {
            System.out.println(array.get(i));
        }

    }


}
