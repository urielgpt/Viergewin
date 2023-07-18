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
 * die Klasse erbt von Player und implementiert das Interface
 * java.awt.event.ActionListener
 */
import tuc.isse.model.*;
import tuc.isse.view.VierGewinntFrame;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class FramePlayer extends Player implements  java.awt.event.ActionListener {
    private final VierGewinntFrame vierGewinntFrame;
    public FramePlayer(Color color, Bord bord, VierGewinntFrame vierGewinntFrame) {
        super(color, bord);
        this.vierGewinntFrame = vierGewinntFrame;
    }

    @Override
    public void doTurn() throws ColumnFullException, IllegalMoveException, IOException {
        vierGewinntFrame.addButtonListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        int columnIndex = Integer.parseInt(actionCommand);
        try {
            this.bord.dropToken(this.bord.getToken(this.getColor()), columnIndex);
        } catch (ColumnFullException | IllegalMoveException | IOException ex ) {
            throw new RuntimeException(ex);
        }
        vierGewinntFrame.entButtonListener(this);

    }


}
