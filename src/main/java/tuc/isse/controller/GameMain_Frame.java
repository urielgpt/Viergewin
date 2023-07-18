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
 * diese KLasse initiert und beginnt das Spiel
 */
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;
import tuc.isse.model.ObservableBord;
import tuc.isse.view.Drawcircle;
import tuc.isse.view.VierGewinntFrame;

import java.io.IOException;

public class GameMain_Frame {
    public static void main(String[] args) throws ColumnFullException, IllegalMoveException, IOException {
        ObservableBord bord = new ObservableBord();
        Drawcircle drawcircle = new Drawcircle(bord);
        VierGewinntFrame frame = new VierGewinntFrame(bord, drawcircle);
        FramePlayer player1 = new FramePlayer(Color.RED, bord, frame);
        FramePlayer player2 = new FramePlayer(Color.YELLOW, bord, frame);
        FrameGame game = new FrameGame(bord, frame);
        game.doGame(player1,player2);

    }
}
