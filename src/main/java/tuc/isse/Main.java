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
 * In diese Klasse kann man das Spiel ausführen
 */
public  class Main {

    public static void main(String[] args) throws ColumnFullException {
        Bord bord = new Bord();
        bord.dropToken(Color.RED, 6);
        bord.dropToken(Color.RED, 6);
        bord.dropToken(Color.RED, 6);
        bord.dropToken(Color.YELLOW, 6);
        bord.dropToken(Color.YELLOW, 5);
        bord.dropToken(Color.RED, 5);
        bord.dropToken(Color.YELLOW, 4);
        bord.dropToken(Color.YELLOW, 4);
        bord.dropToken(Color.RED, 4);
        bord.dropToken(Color.YELLOW, 3);
        bord.dropToken(Color.YELLOW, 2);
        bord.dropToken(Color.RED, 2);

    }
}
