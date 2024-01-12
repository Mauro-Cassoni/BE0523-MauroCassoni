package it.epicode.week1.day5;

public class Video extends ElementoMultimediale implements iElementoMultimediale{

    public int volume;
    public int luminosita;

    public Video(String name, int volume, int luminosita) {
        super(name);
        this.volume = volume;
        this.luminosita = luminosita;

    }

    @Override
    public void play() {
        for(int i = 0; i < durata; i++) {
            System.out.print(name + " ");
            for (int j = 0; j < volume; j++){
                System.out.print("!");
            }
            for (int x = 0; x < luminosita; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void alzaLuminosita() {
        this.luminosita++;
    }

    public void abbassaLuminosita() {
        this.luminosita--;
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
