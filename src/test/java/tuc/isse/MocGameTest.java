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
import tuc.isse.controller.ConsoleGame;
import tuc.isse.controller.MocPlayer;
import tuc.isse.model.*;
import tuc.isse.view.BordObserver;

import java.io.IOException;

class MocGameTest implements BordObserver {
    @Test
    public void  MocGame_Test() throws ColumnFullException, IllegalMoveException, IOException {
        Bord bord = new Bord();
        ConsoleGame game = new ConsoleGame(bord);
        MocPlayer player_1 = new MocPlayer(Color.RED, bord,0);
        MocPlayer player_2 = new MocPlayer(Color.YELLOW, bord,1);
        game.doGame(player_1, player_2);
        Assertions.assertEquals(bord.testVictory(), Winner.RED);
    }
    @Override
    public void update(ObservableBord bord) throws ColumnFullException, IllegalMoveException {
        Assertions.assertTrue(bord.getBordObservers().contains(this)); // Der Observer_mechanismus wird hier durch den Aufruf der Methode assertTrue getestet
    }

    @Override
    public void update_load(ObservableBord observableBord) {

    }

    @Test
    public void  MocGame_Test_2() throws ColumnFullException, IllegalMoveException, IOException {
        ObservableBord bord1 = new ObservableBord();
        bord1.addObserver(this);
        Assertions.assertEquals(bord1.getBordObservers().size(), 1);
        bord1.dropToken(bord1.getToken(Color.RED), 0);
        bord1.removeObserver();
        Assertions.assertEquals(bord1.getBordObservers().size(), 0);
        bord1.dropToken(bord1.getToken(Color.RED), 0);

    }
}