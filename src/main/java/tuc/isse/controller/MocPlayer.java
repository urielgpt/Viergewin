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
package tuc.isse.controller;

import tuc.isse.model.Bord;
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;

import java.io.IOException;

/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * diese Klasse dient für den Test der Spiellogik
 */
public class MocPlayer extends Player {
    private int move;
    public MocPlayer(Color color, Bord bord, int move) {
        super(color, bord);
        this.move = move;
    }

    @Override
    public void doTurn() throws ColumnFullException, IllegalMoveException, IOException {
        super.doDrop(move);

    }
}
