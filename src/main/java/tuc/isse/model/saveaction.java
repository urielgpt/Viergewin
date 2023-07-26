package tuc.isse.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class saveaction implements ActionListener {
    Bord bord;
    public saveaction(Bord bord){
        this.bord = bord;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            bord.save("save");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
