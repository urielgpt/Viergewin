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

import tuc.isse.model.Bord;
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;

import java.io.IOException;

/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * In diese Klasse kann man das Spiel ausführen
 */
public  class Main {

    public static void main(String[] args) throws ColumnFullException, IllegalMoveException, IOException {
        Bord board = new Bord();
        board.dropToken(board.getToken(Color.RED), 6);
        board.dropToken(board.getToken(Color.RED), 6);
        board.dropToken(board.getToken(Color.RED), 6);
        board.dropToken(board.getToken(Color.YELLOW), 6);
        board.dropToken(board.getToken(Color.YELLOW), 5);
        board.dropToken(board.getToken(Color.RED), 5);
        board.dropToken(board.getToken(Color.YELLOW), 4);
        board.dropToken(board.getToken(Color.YELLOW), 4);
        board.dropToken(board.getToken(Color.RED), 4);
        board.dropToken(board.getToken(Color.YELLOW), 3);
        board.dropToken(board.getToken(Color.YELLOW), 2);


    }
}
