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
 * die Klasse implementiert die doGame-Methode.
 */
import tuc.isse.model.*;
import tuc.isse.view.BordObserver;
import tuc.isse.view.VierGewinntFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.io.IOException;

public class FrameGame extends Game implements BordObserver {
    private final VierGewinntFrame vierGewinntFrame;
    private Player ist_dran;

    public FrameGame(ObservableBord bord, VierGewinntFrame vierGewinntFrame) {
        super(bord);
        this.vierGewinntFrame = vierGewinntFrame;
        bord.addObserver(this);
    }

    @Override
    public void doGame(Player player1, Player player2) throws ColumnFullException, IllegalMoveException, IOException {
        this.player_x = player1;
        this.player_o = player2;
        ist_dran = player_x;
        ist_dran.doTurn();
    }

    @Override
    public void update(ObservableBord bord) throws ColumnFullException, IllegalMoveException, IOException {

        vierGewinntFrame.update(bord);
        if (bord.testVictory() == Winner.NONE) {

            if (this.dran == 1) ist_dran = player_x;
            else ist_dran = player_o;
            swapPlayer();
            ist_dran.doTurn();
        } else {
            for (JButton buttons : vierGewinntFrame.buttons) {
                buttons.setEnabled(false);
            }
            if (bord.testVictory() == Winner.RED) {
                JLabel label = new JLabel("                     And the Winner ist : Rot");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                label.setForeground(Color.blue);
                vierGewinntFrame.add(label, BorderLayout.SOUTH);
                vierGewinntFrame.setVisible(true);
            } else if (bord.testVictory() == Winner.YELLOW) {
                JLabel label = new JLabel("                     And the Winner ist : Gelb");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                label.setForeground(Color.blue);
                vierGewinntFrame.add(label,BorderLayout.SOUTH);
                vierGewinntFrame.setVisible(true);
            }
            else {
                JLabel label = new JLabel("       Niemand hat gewonnen : Das Spiel ist fertig");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                label.setForeground(Color.black);
                vierGewinntFrame.add(label,BorderLayout.SOUTH);
                vierGewinntFrame.setVisible(true);

            }

        }
    }
}
