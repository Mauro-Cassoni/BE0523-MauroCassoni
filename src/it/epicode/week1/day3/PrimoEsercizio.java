package it.epicode.week1.day3;

public class PrimoEsercizio {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(30,30);
        Rettangolo rettangolo2 = new Rettangolo(10,10);

        System.out.println(Rettangolo.stampaRettangolo(rettangolo1));
        System.out.println(Rettangolo.stampaRettangolo(rettangolo2));

        System.out.println(Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2));

        System.out.println(Rettangolo.getRettangolo(rettangolo1));
        System.out.println(Rettangolo.getRettangolo(rettangolo2));



    }
}
