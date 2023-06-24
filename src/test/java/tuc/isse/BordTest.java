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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * diese Klasse dient als Test für das Spiel
 */

class BordTest {
    @Test
    public void Board_1() throws ColumnFullException {
        Bord board_1 = new Bord();
        board_1.dropToken(Color.RED, 6);
        board_1.dropToken(Color.RED, 6);
        board_1.dropToken(Color.RED, 6);
        board_1.dropToken(Color.YELLOW, 6);
        board_1.dropToken(Color.YELLOW, 5);
        board_1.dropToken(Color.RED, 5);
        board_1.dropToken(Color.YELLOW, 4);
        board_1.dropToken(Color.YELLOW, 4);
        board_1.dropToken(Color.RED, 4);
        board_1.dropToken(Color.YELLOW, 3);
        board_1.dropToken(Color.YELLOW, 2);
        /*board_1.dropToken(Color.RED, 2);*/
        Assertions.assertEquals("""
                [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [ ] [ ] [O]\s
                [ ] [ ] [ ] [ ] [X] [ ] [X]\s
                [ ] [ ] [ ] [ ] [O] [X] [X]\s
                [ ] [ ] [O] [O] [O] [O] [X]\s
                """, board_1.toString());
    }
    @Test
    public void Board_2() throws ColumnFullException {
        Bord board_2 = new Bord();
        board_2.dropToken(Color.YELLOW, 6);
        board_2.dropToken(Color.YELLOW, 6);
        board_2.dropToken(Color.YELLOW, 6);
        board_2.dropToken(Color.YELLOW, 5);
        board_2.dropToken(Color.RED, 5);
        board_2.dropToken(Color.YELLOW, 4);
        board_2.dropToken(Color.RED, 4);
        board_2.dropToken(Color.RED, 4);
        board_2.dropToken(Color.RED, 4);
        board_2.dropToken(Color.RED, 4);
        /*board_2.dropToken(Color.RED, 3);
        board_2.dropToken(Color.YELLOW, 2);
        board_2.dropToken(Color.RED, 2);
        board_2.dropToken(Color.RED, 1);
        board_2.dropToken(Color.YELLOW, 0);*/
        Assertions.assertEquals("""
                [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [X] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [X] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [X] [ ] [O]\s
                [ ] [ ] [ ] [ ] [X] [X] [O]\s
                [ ] [ ] [ ] [ ] [O] [O] [O]\s
                """, board_2.toString());
    }
    @Test
    public void Board_3() throws ColumnFullException {
        Bord board_3 = new Bord();
        board_3.dropToken(Color.RED, 6);
        board_3.dropToken(Color.RED, 6);
        board_3.dropToken(Color.RED, 6);
        board_3.dropToken(Color.YELLOW, 6);
        board_3.dropToken(Color.YELLOW, 5);
        board_3.dropToken(Color.RED, 5);
        board_3.dropToken(Color.YELLOW, 5);
        board_3.dropToken(Color.YELLOW, 4);
        board_3.dropToken(Color.YELLOW, 4);
        board_3.dropToken(Color.RED, 4);
        board_3.dropToken(Color.YELLOW, 3);
        /*board_3.dropToken(Color.YELLOW, 3);
        board_3.dropToken(Color.RED, 3);
        board_3.dropToken(Color.RED, 3);*/
        Assertions.assertEquals("""
                [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                [ ] [ ] [ ] [ ] [ ] [ ] [O]\s
                [ ] [ ] [ ] [ ] [X] [O] [X]\s
                [ ] [ ] [ ] [ ] [O] [X] [X]\s
                [ ] [ ] [ ] [O] [O] [O] [X]\s
                """, board_3.toString());
    }
}