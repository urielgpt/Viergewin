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
import tuc.isse.controller.ConsoleGame;
import tuc.isse.controller.ConsolePlayer;
import tuc.isse.model.Bord;
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;

import java.io.IOException;

public class GameMain_Console {
    public static void main(String[] args) throws IllegalMoveException, IOException {
        Bord bord = new Bord();
        ConsoleGame consoleGame = new ConsoleGame(bord);
        ConsolePlayer player_1 = new ConsolePlayer(Color.RED, bord);
        ConsolePlayer player_2 = new ConsolePlayer(Color.YELLOW, bord);
        consoleGame.doGame(player_1, player_2);
    }
}

