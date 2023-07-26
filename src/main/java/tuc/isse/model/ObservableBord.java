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
 * die Klasse speichert in einem pri-
 * vaten Attribut eine Menge von Referenzen vom Typ BordObserver
 */
import tuc.isse.view.BordObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObservableBord extends Bord{
    private final List<BordObserver> bordObservers = new ArrayList<>();
    public List<BordObserver> bordObservers_load = new ArrayList<>();

    public void addObserver(BordObserver bordObserver){
        this.bordObservers.add(bordObserver);
    }
    public void removeObserver(){
        this.bordObservers.remove(0);
    }

    public List<BordObserver> getBordObservers() {
        return bordObservers;
    }

    public void notifyObserver() throws ColumnFullException, IllegalMoveException, IOException {
        for (BordObserver bordObserver : bordObservers){
            bordObserver.update(this);
        }
    }
    public void notifyObserver_load() throws ColumnFullException, IllegalMoveException, IOException {
        for (BordObserver bordObserver : bordObservers){
            bordObserver.update_load(this);
        }
    }
    @Override
    public void dropToken(Token token, int columnIndex) throws ColumnFullException, IllegalMoveException, IOException {
        super.dropToken(token, columnIndex);
        notifyObserver();
    }
}
