package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Komento;
import laskin.Sovelluslogiikka;

public class Erotus implements Komento {
    
    private TextField tuloskentta;
    private TextField syotekentta;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovelluslogiikka;

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovelluslogiikka) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovelluslogiikka = sovelluslogiikka;
    }
    
    @Override
    public void suorita() {
        sovelluslogiikka.miinus(Integer.parseInt(syotekentta.getText()));
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
