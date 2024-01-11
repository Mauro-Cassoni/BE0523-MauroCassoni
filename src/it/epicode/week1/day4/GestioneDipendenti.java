package it.epicode.week1.day4;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GestioneDipendenti {

    public static void main(String[] args) {

        Dipendente dip1 = new Dipendente(Livello.OPERAIO,Dipartimento.PRODUZIONE, 1000,01,0,10);
        Dipendente dip2 = new Dipendente(Livello.OPERAIO,Dipartimento.PRODUZIONE, 1000,02,0,10);
        Dipendente dip3 = new Dipendente(Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE, 1000,03,0,10);
        Dipendente dip4 = new Dipendente(Livello.DIRIGENTE,Dipartimento.VENDITE, 1000,04,0,10);

        dip1.promuovi();
        dip3.promuovi();

        System.out.println(dip1.stampaDatiDipendente());
        System.out.println(dip2.stampaDatiDipendente());
        System.out.println(dip3.stampaDatiDipendente());
        System.out.println(dip4.stampaDatiDipendente());

        System.out.println(Dipendente.calcolaPaga(dip1,5));
        System.out.println(Dipendente.calcolaPaga(dip2,5));
        System.out.println(Dipendente.calcolaPaga(dip3,5));
        System.out.println(Dipendente.calcolaPaga(dip4,5));






    }
}
