package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tervetuloa pelaamaan Kivi-Paperit-Saksia."
                + "\nValitse pelityyppi: "
                + "\n\"kaksinpeli\", \"tekoäly\", \"parempi\" tekoäly"
                + "\ntai \"lopeta\" sulkeaksesi ohjelman.");
        Pelitehdas pelitehdas = new Pelitehdas();
        
        while (true) {
            String pelityyppi = scanner.nextLine();
            if (pelityyppi.equals("lopeta")) break;
            pelitehdas.hae(pelityyppi).pelaa();
        }

    }
}
