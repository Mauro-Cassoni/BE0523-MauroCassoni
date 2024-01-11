package it.epicode.week1.day4;

public class Dipendente {

    private double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;


    public Dipendente(Livello livello, Dipartimento dipartimento, double stipendioBase, int matricola, double stipendio,double importoOrarioStraordinario) {

         this.stipendioBase=stipendioBase;
         this.matricola=matricola;
         this.stipendio=stipendio;
         this.importoOrarioStraordinario=importoOrarioStraordinario;
         this.livello=livello;
         this.dipartimento=dipartimento;

    }

    public Dipendente(int matricola, Dipartimento dipartimento){
        this.matricola = matricola;
        this.dipartimento = dipartimento;

        stipendio = stipendioBase;
        importoOrarioStraordinario = 30;
        livello = Livello.OPERAIO;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public it.epicode.week1.day4.Livello getLivello() {
        return livello;
    }

    public it.epicode.week1.day4.Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(it.epicode.week1.day4.Dipartimento dipartimento) {
        dipartimento = dipartimento;
    }

    public String stampaDatiDipendente() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public Livello promuovi(){
        switch (livello){
            case livello.OPERAIO:
                livello = Livello.IMPIEGATO;
                stipendio = stipendioBase * 1.2;
                break;
            case livello.IMPIEGATO:
                livello = Livello.QUADRO;
                stipendio = stipendioBase * 1.5;
                break;
            case livello.QUADRO:
                livello = Livello.DIRIGENTE;
                stipendio = stipendioBase * 2;
                break;
            case livello.DIRIGENTE:
                System.out.println("Il dipendente è già al livello massimo.");
                break;
            default:
                livello = Livello.OPERAIO;
        }
        return livello;
    }

    public static String calcolaPaga(Dipendente d, int ore){
        d.stipendio += d.stipendioBase;
         if (ore == 0){
             return  "lo stipendio del dipendente é di: " + d.stipendio + "€";
         } else {
             d.stipendio += ore * d.importoOrarioStraordinario;
             return "lo stipendio del dipendente é di: " + d.stipendio + "€";
         }

    }


}
