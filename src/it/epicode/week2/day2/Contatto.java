package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Contatto {

    private static final HashMap<String,String> rubrica =  new HashMap<>();

    public static void main(String[] args) {

        add("Ema","321654987");
        add("Emi","321987654");
        add("Mau","321456987");


        System.out.println("cerca con numero: " + searchByNumber("321456987"));
        System.out.println("cerca con numero: " + searchByNumber("321654988"));
        System.out.println("cerca con nome: " + searchByName("Ema"));
        removeByName("Emi");

        stampaRubrica();

    }

    public static void add(String nome, String numero){
        rubrica.put(nome, numero);
    }

    public  static void removeByName(String nome){
        rubrica.remove(nome);
    }

    public  static String searchByNumber(String numero){
        Set<String> chiave = rubrica.keySet();
        for (String c:chiave){
            if (rubrica.get(c).equals(numero))
                return c;
        }
        return "Numero non trovato";
    }

    public  static String searchByName(String nome){
        return rubrica.get(nome);
    }

    public static void stampaRubrica(){
        Set<String> chiave = rubrica.keySet();
        for (String c:chiave){
            System.out.println(c + " " + rubrica.get(c));
        }
    }








}
