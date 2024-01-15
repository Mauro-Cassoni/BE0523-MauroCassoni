package it.epicode.week1.day5;

import java.util.Scanner;

public class LettoreMultimediale {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementiSalvati = new ElementoMultimediale[5];

        for(int i = 0; i < elementiSalvati.length; i++){
            System.out.println("Cosa vuoi creare?");
            System.out.println("1 per Audio");
            System.out.println("2 per Video");
            System.out.println("3 per Immagine");

            switch (scanner.nextInt()){
                case 1:
                    scanner.nextLine();
                    System.out.println("Scegli il titolo");
                    String name = scanner.nextLine();

                    System.out.println("Scegli il volume");
                    int volume = scanner.nextInt();

                    RegistrazioneAudio audio = new RegistrazioneAudio(name, volume);
                    elementiSalvati[i] = audio;

                    ((RegistrazioneAudio)elementiSalvati[i]).play();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Scegli il titolo");
                    String name1 = scanner.nextLine();

                    System.out.println("Scegli il volume");
                    int volume1 = scanner.nextInt();

                    System.out.println("Scegli la luminosita");
                    int luminosita1 = scanner.nextInt();

                    Video video = new Video(name1, volume1, luminosita1);
                    elementiSalvati[i] = video;
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Scegli il titolo");
                    String name2 = scanner.nextLine();

                    System.out.println("Scegli luminosita");
                    int luminosita = scanner.nextInt();

                    Immagine img = new Immagine(name2, luminosita);
                    elementiSalvati[i] = img;
                    break;

            }
        }

        player(elementiSalvati);

    }

    public static void player(ElementoMultimediale[] array){
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Inserisci un numero da 1 a 5 per scegliere cosa riprodurre,");
            System.out.println("inserisci 0 per uscire dalla riproduzione.");
            numero = scanner.nextInt();
            if (numero < 0 || numero > 5){
                System.out.println("Scelta non dipsonibile, chiusura programma...");
                return;
            } else {
                if (numero == 0) continue;


                if (array[numero - 1] instanceof RegistrazioneAudio audio) {

                    int n1;

                    do {
                        System.out.println("Opzioni disponibili:");
                        System.out.println("1 play");
                        System.out.println("2 alza volume");
                        System.out.println("3 abbassa volume");
                        System.out.println("4 imposta volume");
                        System.out.println("0 esci");
                        n1 = scanner.nextInt();
                        if (n1 < 0 || n1 > 4) {
                            System.out.println("Scelta non dipsonibile, chiusura programma...");
                            return;
                        } else {

                            switch (n1) {
                                case 1:
                                    audio.play();
                                    break;
                                case 2:
                                    audio.alzaVolume();
                                    break;
                                case 3:
                                    audio.abbassaVolume();
                                    break;
                                case 4:
                                    System.out.println("Scrivi il volume desiderato");
                                    int v = scanner.nextInt();
                                    audio.setVolume(v);
                                case 0:
                                    break;
                                default:
                                    System.out.println("Scelta non valida");
                            }
                        }

                    } while (n1 != 0);
                }




                if (array[numero-1] instanceof Video video) {
                    int n1;

                    do {
                        System.out.println("Opzioni disponibili:");
                        System.out.println("1 play");
                        System.out.println("2 alza volume");
                        System.out.println("3 abbassa volume");
                        System.out.println("4 imposta volume");
                        System.out.println("5 alza luminosità");
                        System.out.println("6 abbassa luminosità");
                        System.out.println("0 esci");
                        n1 = scanner.nextInt();
                        if (n1 < 0 || n1 > 6) {
                            System.out.println("Scelta non dipsonibile, chiusura programma...");
                            return;
                        } else {

                            switch (n1) {
                                case 1:
                                    video.play();
                                    break;
                                case 2:
                                    video.alzaVolume();
                                    break;
                                case 3:
                                    video.abbassaVolume();
                                    break;
                                case 4:
                                    System.out.println("Scrivi il volume desiderato");
                                    int v = scanner.nextInt();
                                    video.setVolume(v);
                                case 5:
                                    video.alzaLuminosita();
                                    break;
                                case 6:
                                    video.abbassaLuminosita();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Scelta non valida");
                            }
                        }


                    } while (n1 != 0);
                }

                if (array[numero-1] instanceof Immagine img){
                    int n1;

                    do {
                        System.out.println("Opzioni disponibili:");
                        System.out.println("1 mostra");
                        System.out.println("2 alza luminosità");
                        System.out.println("3 abbassa luminosità");
                        System.out.println("0 esci");
                        n1 = scanner.nextInt();
                        if (n1 < 0 || n1 > 3) {
                            System.out.println("Scelta non dipsonibile, chiusura programma...");
                            return;
                        } else {

                            switch (n1) {
                                case 1:
                                    img.show();
                                    break;
                                case 2:
                                    img.alzaLuminosita();
                                    break;
                                case 3:
                                    img.abbassaLuminosita();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Scelta non valida");
                            }
                        }

                    } while (n1 != 0);
                }
            }
        } while (numero != 0);
        System.out.println("Hai inserito 0. Il programma termina.");
    }







}

