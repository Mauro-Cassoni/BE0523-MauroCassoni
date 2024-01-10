package it.epicode.week1.day3;

public class Rettangolo {

    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;
    }

    public static String stampaRettangolo(Rettangolo r){
        int area = r.altezza * r.larghezza;
        int perimetro = (r.altezza + r.larghezza) * 2;
        return "L'area del rettangolo è: " + area +  ", Il perimetro del rettangolo è: " + perimetro;
    }

    public static String stampaDueRettangoli(Rettangolo r1,Rettangolo r2){
        int area1 = r1.altezza * r1.larghezza;
        int area2 = r2.altezza * r2.larghezza;

        int perimetro1 = (r1.altezza + r1.larghezza) * 2;
        int perimetro2 = (r2.altezza + r2.larghezza) * 2;

        int sommaArea = area1 + area2;
        int sommaPerimetro = perimetro1 + perimetro2;

        return "L'area del primo rettanfolo è: " + area1 +  ", Il perimetro del primo rettangolo è: " + perimetro1 +
                ", L'area del secondo rettangolo è: " + area2 + ", Il perimetro del secondo rettangolo è: " + perimetro2 +
                ", La somma dell'area dei 2 rettangoli é " + sommaArea + ", La somma del perimetro dei 2 rettangoli é " + sommaPerimetro;

    }

    public static String getRettangolo(Rettangolo r){
        return "L'altezza del rettangolo è " + r.altezza + ", la larghezza del rettangolo è " + r.larghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
}
