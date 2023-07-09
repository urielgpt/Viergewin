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
 * die Klasse erbt von Game und implementiert die doGame -Methode
 */
import java.io.IOException;

public class ConsoleGame extends Game{
    public ConsoleGame(Bord bord) {
        super(bord);
    }
    @Override
    public void doGame(Player player1, Player player2) throws ColumnFullException, IllegalMoveException, IOException {
        this.player_x = player1;
        this.player_o = player2;
        Player ist_dran = player_x;
        while(bord.testVictory() == Winner.NONE){
            ist_dran.doTurn();
            swapPlayer();
            if(dran == 0) ist_dran = player_x;
            else ist_dran = player_o;
        }
    }
}
