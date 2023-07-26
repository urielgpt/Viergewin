///////////////////////////////////
/*
 * uriel.delmas.teponou.wamba@tu-clausthal.de
 * Vorname: Uriel Delmas
 * Nachname: Teponou Wamba
 *
 * Partner
 *
 * kailas.mahadev.sargar@tu-clausthal.de
 * Vorname: Kailas
 * Nachname: Sargar
 */
package tuc.isse.model;
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse gestaltet die Actionevent save
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class saveaction implements ActionListener {
    Bord bord;
    public saveaction(Bord bord){
        this.bord = bord;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            bord.save("save");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
