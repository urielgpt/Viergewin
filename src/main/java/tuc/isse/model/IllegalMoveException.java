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
 * diese Klasse gestaltet die Ausnahme, die auftritt, wenn das ganze Brett voll ist
 */
public class IllegalMoveException extends Exception {
    public IllegalMoveException(String arrayIsVoll) {
        super(arrayIsVoll);
    }

}