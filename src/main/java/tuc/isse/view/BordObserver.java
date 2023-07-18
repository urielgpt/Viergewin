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
package tuc.isse.view;
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse ist ein Interface für die Methode "update"
 */
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;
import tuc.isse.model.ObservableBord;

import java.io.IOException;

public interface BordObserver {
    public void update(ObservableBord bord) throws ColumnFullException, IllegalMoveException, IOException;
}
