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
 * diese Klasse dient als Test für das Spiel
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tuc.isse.model.Bord;
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;

import java.io.IOException;

class BoardTest {
    @Test
    public void Board_1() throws ColumnFullException, IllegalMoveException, IOException {
        Bord board_1 = new Bord();
        board_1.dropToken(board_1.getToken(Color.RED), 6);
        board_1.dropToken(board_1.getToken(Color.RED), 6);
        board_1.dropToken(board_1.getToken(Color.RED), 6);
        board_1.dropToken(board_1.getToken(Color.YELLOW), 6);
        board_1.dropToken(board_1.getToken(Color.YELLOW), 5);
        board_1.dropToken(board_1.getToken(Color.RED), 5);
        board_1.dropToken(board_1.getToken(Color.YELLOW), 4);
        board_1.dropToken(board_1.getToken(Color.YELLOW), 4);
        board_1.dropToken(board_1.getToken(Color.RED), 4);
        board_1.dropToken(board_1.getToken(Color.YELLOW), 3);
        board_1.dropToken(board_1.getToken(Color.YELLOW), 2);
        //board_1.dropToken(board_1.getToken(Color.RED), 2);
        Assertions.assertEquals(
                """
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [ ] [ ] [O]\s
                        [ ] [ ] [ ] [ ] [X] [ ] [X]\s
                        [ ] [ ] [ ] [ ] [O] [X] [X]\s
                        [ ] [ ] [O] [O] [O] [O] [X]\s
                        """, board_1.toString());
    }
    @Test
    public void Board_2() throws ColumnFullException, IllegalMoveException, IOException {
        Bord board_2 = new Bord();
        board_2.dropToken(board_2.getToken(Color.YELLOW), 6);
        board_2.dropToken(board_2.getToken(Color.YELLOW), 6);
        board_2.dropToken(board_2.getToken(Color.YELLOW), 6);
        board_2.dropToken(board_2.getToken(Color.YELLOW), 5);
        board_2.dropToken(board_2.getToken(Color.RED), 5);
        board_2.dropToken(board_2.getToken(Color.YELLOW), 4);
        board_2.dropToken(board_2.getToken(Color.RED), 4);
        board_2.dropToken(board_2.getToken(Color.RED), 4);
        board_2.dropToken(board_2.getToken(Color.RED), 4);
        board_2.dropToken(board_2.getToken(Color.RED), 4);
        //board_2.dropToken(board_2.getToken(Color.RED), 3);
        //board_2.dropToken(board_2.getToken(Color.YELLOW), 2);
        //board_2.dropToken(board_2.getToken(Color.RED), 2);
        //board_2.dropToken(board_2.getToken(Color.RED), 1);
        //board_2.dropToken(board_2.getToken(Color.YELLOW), 0);
        Assertions.assertEquals(
                """
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [X] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [X] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [X] [ ] [O]\s
                        [ ] [ ] [ ] [ ] [X] [X] [O]\s
                        [ ] [ ] [ ] [ ] [O] [O] [O]\s
                        """, board_2.toString());
    }
    @Test
    public void Board_3() throws ColumnFullException, IllegalMoveException, IOException {
        Bord board_3 = new Bord();
        board_3.dropToken(board_3.getToken(Color.RED), 6);
        board_3.dropToken(board_3.getToken(Color.RED), 6);
        board_3.dropToken(board_3.getToken(Color.RED), 6);
        board_3.dropToken(board_3.getToken(Color.YELLOW), 6);
        board_3.dropToken(board_3.getToken(Color.YELLOW), 5);
        board_3.dropToken(board_3.getToken(Color.RED), 5);
        board_3.dropToken(board_3.getToken(Color.YELLOW), 5);
        board_3.dropToken(board_3.getToken(Color.YELLOW), 4);
        board_3.dropToken(board_3.getToken(Color.YELLOW), 4);
        board_3.dropToken(board_3.getToken(Color.RED), 4);
        board_3.dropToken(board_3.getToken(Color.YELLOW), 3);
        //board_3.dropToken(board_3.getToken(Color.YELLOW), 3);
        //board_3.dropToken(board_3.getToken(Color.RED), 3);
        //board_3.dropToken(board_3.getToken(Color.RED), 3);
        Assertions.assertEquals(
                """
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [ ] [ ] [O]\s
                        [ ] [ ] [ ] [ ] [X] [O] [X]\s
                        [ ] [ ] [ ] [ ] [O] [X] [X]\s
                        [ ] [ ] [ ] [O] [O] [O] [X]\s
                        """, board_3.toString());
    }
    @Test
    public void Board_4() throws ColumnFullException, IllegalMoveException, IOException {
        Bord board_4 = new Bord();
        board_4.dropToken(board_4.getToken(Color.RED), 6);
        board_4.dropToken(board_4.getToken(Color.RED), 6);
        board_4.dropToken(board_4.getToken(Color.RED), 6);
        board_4.dropToken(board_4.getToken(Color.YELLOW), 5);
        board_4.dropToken(board_4.getToken(Color.RED), 5);
        board_4.dropToken(board_4.getToken(Color.YELLOW), 5);
        board_4.dropToken(board_4.getToken(Color.YELLOW), 4);
        board_4.dropToken(board_4.getToken(Color.YELLOW), 4);
        board_4.dropToken(board_4.getToken(Color.RED), 4);
        board_4.dropToken(board_4.getToken(Color.YELLOW), 3);
        board_4.dropToken(board_4.getToken(Color.YELLOW), 3);
        board_4.dropToken(board_4.getToken(Color.RED), 3);
        board_4.dropToken(board_4.getToken(Color.RED), 3);
        Assertions.assertEquals(
                """
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [ ] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [X] [ ] [ ] [ ]\s
                        [ ] [ ] [ ] [X] [X] [O] [X]\s
                        [ ] [ ] [ ] [O] [O] [X] [X]\s
                        [ ] [ ] [ ] [O] [O] [O] [X]\s
                        """, board_4.toString());
    }

    @Test
    public void Board_5() throws ColumnFullException, IllegalMoveException, IOException {
        Bord board_5 = new Bord();
        board_5.dropToken(board_5.getToken(Color.RED), 6);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 6);
        board_5.dropToken(board_5.getToken(Color.RED), 6);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 6);
        board_5.dropToken(board_5.getToken(Color.RED), 6);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 6);
        board_5.dropToken(board_5.getToken(Color.RED), 5);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 5);
        board_5.dropToken(board_5.getToken(Color.RED), 5);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 5);
        board_5.dropToken(board_5.getToken(Color.RED), 5);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 5);
        board_5.dropToken(board_5.getToken(Color.RED), 4);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 4);
        board_5.dropToken(board_5.getToken(Color.RED), 4);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 4);
        board_5.dropToken(board_5.getToken(Color.RED), 4);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 4);
        board_5.dropToken(board_5.getToken(Color.RED), 2);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 2);
        board_5.dropToken(board_5.getToken(Color.RED), 2);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 2);
        board_5.dropToken(board_5.getToken(Color.RED), 2);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 2);
        board_5.dropToken(board_5.getToken(Color.RED), 1);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 1);
        board_5.dropToken(board_5.getToken(Color.RED), 1);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 1);
        board_5.dropToken(board_5.getToken(Color.RED), 1);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 1);
        board_5.dropToken(board_5.getToken(Color.RED), 0);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 0);
        board_5.dropToken(board_5.getToken(Color.RED), 0);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 0);
        board_5.dropToken(board_5.getToken(Color.RED), 0);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 0);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 3);
        board_5.dropToken(board_5.getToken(Color.RED), 3);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 3);
        board_5.dropToken(board_5.getToken(Color.RED), 3);
        board_5.dropToken(board_5.getToken(Color.YELLOW), 3);
        board_5.dropToken(board_5.getToken(Color.RED), 3);
        Assertions.assertEquals(
                """
                        [O] [O] [O] [X] [O] [O] [O]\s
                        [X] [X] [X] [O] [X] [X] [X]\s
                        [O] [O] [O] [X] [O] [O] [O]\s
                        [X] [X] [X] [O] [X] [X] [X]\s
                        [O] [O] [O] [X] [O] [O] [O]\s
                        [X] [X] [X] [O] [X] [X] [X]\s
                        """, board_5.toString());
    }
}