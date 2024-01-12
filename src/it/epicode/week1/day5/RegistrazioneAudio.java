package it.epicode.week1.day5;

public class RegistrazioneAudio extends ElementoMultimediale implements iElementoMultimediale {

    public int volume;

    public RegistrazioneAudio(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public void play() {
        for(int i = 0; i < durata; i++) {
            System.out.print(name + " ");
            for (int j = 0; j < volume; j++){
                System.out.print("!");
            }
            System.out.println();
        }
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
