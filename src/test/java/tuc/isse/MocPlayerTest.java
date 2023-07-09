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
 * die Klasse dient als Test für die Spiellogik
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MocPlayerTest {
    @Test
    public void MocPlayer_Test() throws ColumnFullException, IllegalMoveException, IOException {
        Bord bord = new Bord();
        ConsoleGame game = new ConsoleGame(bord);
        MocPlayer player_1 = new MocPlayer(Color.RED, bord,0);
        MocPlayer player_2 = new MocPlayer(Color.YELLOW, bord,1);
        game.doGame(player_1, player_2);
        Assertions.assertEquals(bord.testVictory(), Winner.RED);
    }

}