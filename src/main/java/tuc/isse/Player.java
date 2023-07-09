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
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse nimmt Nutzereingaben und setzt sie um
 */
import java.io.IOException;

public abstract class Player {

    private Color color;
    private Bord bord;

    public Player(Color color, Bord bord){
        this.color = color;
        this.bord = bord;
    }
    public Color getColor() {
        return color;
    }

    protected void doDrop(int columnIndex) throws ColumnFullException, IllegalMoveException {
        if(columnIndex >= 0 & columnIndex < 7) bord.dropToken(bord.getToken(color), columnIndex);
    }
    public abstract void doTurn() throws ColumnFullException, IllegalMoveException, IOException;
}
