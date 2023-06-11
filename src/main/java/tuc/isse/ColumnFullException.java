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
 * diese Klasse gestaltet die Ausnahme, die auftritt, wenn eine Spalte des Bretts voll ist
 */
public class ColumnFullException extends Exception {

    public ColumnFullException(String arrayIsVoll) {
        super(arrayIsVoll);
    }
}
