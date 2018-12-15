package ohtu.kivipaperisakset;

import java.util.HashMap;

public class Pelitehdas {
    
    private HashMap<String, Peli> pelityypit;

    public Pelitehdas() {
        pelityypit = new HashMap<>();
        pelityypit.put("kaksinpeli", new KPSPelaajaVsPelaaja());
        pelityypit.put("tekoäly", new KPSTekoaly());
        pelityypit.put("parempi", new KPSParempiTekoaly());
        pelityypit.put("tuntematon", new Tuntematon());
    }
    
    public Peli hae(String pelityyppi) {
        Peli peli = pelityypit.get(pelityyppi);
        if (peli == null) {
            peli = pelityypit.get("tuntematon");
        }
        return peli;
    }
    
}
