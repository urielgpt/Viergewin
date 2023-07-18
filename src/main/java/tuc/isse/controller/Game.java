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
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse führt den eigentlichen Spielablauf durch. Die Klasse koordiniert die beiden Spieler koor-
 * und einen bestimmt einen Sieger.
 */
import tuc.isse.controller.Player;
import tuc.isse.model.Bord;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;

import java.io.IOException;

public abstract class Game {
    protected Bord bord;
    protected Player player_x;
    protected Player player_o;
    protected int dran = 0;

    public Game(Bord bord){
        this.bord = bord;
    }
    protected void swapPlayer(){
        if(dran == 0) dran = 1;
        else dran = 0;
    }
    public abstract void doGame(Player player1, Player player2) throws ColumnFullException, IllegalMoveException, IOException;
}
