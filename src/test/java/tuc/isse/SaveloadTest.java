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
package tuc.isse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tuc.isse.model.Bord;
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse dient als Test für die save-load Funktion
 */
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SaveloadTest {
    @Test
    public void save_loadtest() throws ColumnFullException, IllegalMoveException, IOException {
        Bord bord = new Bord();
        bord.dropToken(bord.getToken(Color.RED), 0);
        bord.dropToken(bord.getToken(Color.YELLOW), 1);
        bord.dropToken(bord.getToken(Color.RED), 0);
        bord.dropToken(bord.getToken(Color.YELLOW), 1);
        bord.dropToken(bord.getToken(Color.RED), 0);
        bord.dropToken(bord.getToken(Color.YELLOW), 1);
        bord.save("savetest");
        Bord bord2 = new Bord();
        bord2.load("savetest");
        Assertions.assertEquals(bord.toString(),bord2.toString());
    }

}