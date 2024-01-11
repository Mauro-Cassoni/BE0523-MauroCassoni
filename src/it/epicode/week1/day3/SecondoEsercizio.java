package it.epicode.week1.day3;

import java.util.Arrays;

public class SecondoEsercizio {

    public static void main(String[] args) {

        Sim sim1 = new Sim("369852", 0.20, 0);

        System.out.println(sim1.getCredito());

        sim1.ricarica(50);

        System.out.println(sim1.getCredito());

        System.out.println(sim1.verificaChiamata(120,"369852"));System.out.println(sim1.verificaChiamata(120,"369852"));System.out.println(sim1.verificaChiamata(120,"369852"));System.out.println(sim1.verificaChiamata(120,"369852"));System.out.println(sim1.verificaChiamata(120,"369852"));

        System.out.println(sim1.getCredito());

        System.out.println(Arrays.toString(sim1.getListaChiamate()));

    }
}
