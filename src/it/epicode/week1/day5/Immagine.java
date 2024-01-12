package it.epicode.week1.day5;

public class Immagine extends ElementoMultimediale{

    public int luminosita;
    public Immagine(String name, int luminosita) {
        super(name);
        this.luminosita = luminosita;
    }

    public void show() {
            System.out.print(name + " ");
            for (int i = 0; i < luminosita; i++){
                System.out.print("*");
            }
            System.out.println(" ");
    }

    public void alzaLuminosita() {
        this.luminosita++;
    }

    public void abbassaLuminosita() {
        this.luminosita--;
    }

}
