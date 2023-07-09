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
 * diese Klasse dient für den Test der Spiellogik
 */
public class MocPlayer extends Player{
    private int move;
    public MocPlayer(Color color, Bord bord, int move) {
        super(color, bord);
        this.move = move;
    }

    @Override
    public void doTurn() throws ColumnFullException, IllegalMoveException {
        super.doDrop(move);

    }
}
