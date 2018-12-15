package ohtu.kivipaperisakset;

public class Tuntematon implements Peli {

    public Tuntematon() {
    }
    
    @Override
    public void pelaa() {
        System.out.println("\nValitse pelityyppi: "
                + "\"kaksinpeli\", \"tekoäly\", \"parempi\" tekoäly"
                + "\ntai \"lopeta\" sulkeaksesi ohjelman.");
    }
    
}
