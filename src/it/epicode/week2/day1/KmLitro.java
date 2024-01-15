package it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KmLitro {

    private static final Logger logger= LoggerFactory.getLogger(KmLitro.class);


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        kmPerLitro();

    }

    public static double kmPerLitro(){
        double lt = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci i km percorsi");
            double km = scanner.nextDouble();
            System.out.println("Inserisci i lt consumati");
            lt = scanner.nextDouble();
                if (lt == 0){
                    throw new ArithmeticException("impossibile dividere per 0");
                }
            System.out.println(lt/km);
            return lt/km;
        }
        catch (InputMismatchException ex){
            logger.error("Devi inserire dei numeri");
        }
        catch (ArithmeticException ex){
            logger.error("impossibile dividere per 0");
            System.out.println(ex.getMessage());
        }

        return kmPerLitro();

    }

}
