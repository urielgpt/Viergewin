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
import java.io.IOException;

public class GameMain_Console {
    public static void main(String[] args) throws ColumnFullException, IllegalMoveException, IOException {
        Bord bord = new Bord();
        ConsoleGame consoleGame = new ConsoleGame(bord);
        ConsolePlayer player_1 = new ConsolePlayer(Color.RED, bord);
        ConsolePlayer player_2 = new ConsolePlayer(Color.YELLOW, bord);
        consoleGame.doGame(player_1, player_2);
    }
}

