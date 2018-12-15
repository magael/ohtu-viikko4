package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Komento;
import laskin.Sovelluslogiikka;

public class Nollaa implements Komento {

    private TextField tuloskentta;
    private TextField syotekentta;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovelluslogiikka;
    private int edellinenTulos;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovelluslogiikka) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovelluslogiikka = sovelluslogiikka;
        this.edellinenTulos = 0;
    }

    @Override
    public void suorita() {
        edellinenTulos = sovelluslogiikka.getTulos();
        sovelluslogiikka.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("");
    }

    @Override
    public void peru() {
        sovelluslogiikka.setTulos(edellinenTulos);
        tuloskentta.setText("" + edellinenTulos);
    }

}
