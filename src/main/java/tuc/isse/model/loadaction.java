package tuc.isse.model;
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
import tuc.isse.view.VierGewinntFrame;
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse gestaltet die Actioneveent load
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class loadaction implements ActionListener {
    Bord bord ;
    VierGewinntFrame vierGewinntFrame;
    public loadaction(Bord bord, VierGewinntFrame vierGewinntFrame){
        this.bord = bord;
        this.vierGewinntFrame = vierGewinntFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.bord.load("save");
        this.vierGewinntFrame.removealllistener();
        try {
            this.vierGewinntFrame.bord.notifyObserver();
        } catch (ColumnFullException | IllegalMoveException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
