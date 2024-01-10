package it.epicode.week1.day3;

public class Sim {
    private String numero;
    private double costoPerSecondo;
    private double credito;
    private String[] listaChiamate = new String[5];
    private double durata;
    private String numeroChiamato;

    public Sim(String numero, double costoPerSecondo, double credito){
        this.numero = numero;
        this.costoPerSecondo = costoPerSecondo;
        this.credito = credito;
    }

    public static String getSim(Sim s){
        return "Numero di telefono: " + s.numero + ", il costo per secondo è: " + s.costoPerSecondo + "€" + ", il credito residuo è: " + s.credito + ", la lista delle chiamate è: " + s.listaChiamate;
    }

    public String getNumero() {
        return numero;
    }

    public double getCostoPerSecondo() {
        return costoPerSecondo;
    }

    public String getCredito() {
        return "Il credito è: " + credito + "€";
    }

    public String[] getListaChiamate() {
        return listaChiamate;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public boolean verificaChiamata(double secondi, String numeroChiamato){

        double costoChiamata = this.costoPerSecondo * secondi;
        this.credito -= costoChiamata;
        if (this.credito <= 0){
            this.credito += costoChiamata;
            return false;
        }
        for (int i = this.listaChiamate.length-1; i > 0 ; i--){
            this.listaChiamate[i] = this.listaChiamate[i-1];
        }
        this.listaChiamate[0] = numeroChiamato;

        return true;
    }

    public void ricarica(double ricarica){
        this.credito += ricarica;
    }
}
