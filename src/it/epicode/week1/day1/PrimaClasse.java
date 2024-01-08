package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int moltiplica = moltiplica(5, 2);
        System.out.println(moltiplica);

        String concatena = concatena("ciao ", 2);
        System.out.println(concatena);

        String[] array = new String[5];

        double x,y;

        System.out.println("Inserisci il lato 1 del rettangolo");
        x = scanner.nextDouble();

        System.out.println("Inserisci il lato 2 del rettangolo");
        y = scanner.nextDouble();

        double perimetro = perimetroRettangolo(x, y);
        System.out.println(perimetro);

        System.out.println("Inserisci il numero per scoprire se sia pari o dispari");
        int z = scanner.nextInt();
        int parioDispari = pariDispari(z);
        System.out.println(parioDispari);

        System.out.println("Inserisci il primo lato del triangolo");
        double a = scanner.nextDouble();
        System.out.println("Inserisci il secondo lato del triangolo");
        double b = scanner.nextDouble();
        System.out.println("Inserisci il terzo lato del triangolo");
        double c = scanner.nextDouble();

        double area = areaTriangolo(a,b,c);
        System.out.println(area);





    }

    public static int moltiplica(int x, int y){
        int moltiplica = x*y;
        return moltiplica;
    }

    public static String concatena(String x, int y){
        String concatena = x + y;
        return concatena;
    }

    public static double perimetroRettangolo(double x, double y){
        double perimetro = (x + y) * 2;
        return perimetro;
    }

    public static int pariDispari(int x){
        int numero = x%2;
        return numero;
    }

    public static double areaTriangolo(double x, double y, double z){
        double p = (x + y + z);
        double area = Math.sqrt(p * (p-x) * (p-y) * (p-z));
        return area;
    }



}
