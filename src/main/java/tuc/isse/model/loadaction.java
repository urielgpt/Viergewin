package tuc.isse.model;

import tuc.isse.view.VierGewinntFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class loadaction implements ActionListener {
    Bord bord ;
    VierGewinntFrame vierGewinntFrame;
    public loadaction(Bord bord, VierGewinntFrame vierGewinntFrame){
        this.bord = bord;
        this.vierGewinntFrame = vierGewinntFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.bord.load("save");
        this.vierGewinntFrame.removealllistener();
        try {
            this.vierGewinntFrame.bord.notifyObserver();
        } catch (ColumnFullException | IllegalMoveException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
