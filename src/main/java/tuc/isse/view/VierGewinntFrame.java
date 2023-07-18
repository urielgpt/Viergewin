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
package tuc.isse.view;
/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * die Klasse implementiert das Interface BordObserver
 */
import tuc.isse.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VierGewinntFrame extends JFrame implements BordObserver, ActionListener {
    private final ObservableBord bord;
    public JButton[] buttons = new JButton[7];
    public Drawcircle drawcircle ;

    public VierGewinntFrame(ObservableBord bord, Drawcircle drawcircle) {
        this.bord = bord;
        this.drawcircle = drawcircle;
        this.setSize(505, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("VierGewinSpiel");
        this.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("   " + i + "   ");
            buttons[i].setActionCommand(String.valueOf(i));
            buttons[i].setMargin(new Insets(0, 19, 0, 19));
            buttons[i].addActionListener(this);
            mainPanel.add(buttons[i]);
        }

        this.add(mainPanel, BorderLayout.NORTH);
        update(bord);

        this.setVisible(true);
    }


    public void addButtonListener(ActionListener listener) {
        for (JButton button : buttons) {
            button.addActionListener(listener);
        }
    }

    public void entButtonListener(ActionListener listener) {
        for (JButton button : buttons) {
            button.removeActionListener(listener);
        }
    }

    public void actionPerformed(ActionEvent e) {

    }


    @Override
    public void update(ObservableBord bord) {
        this.add(new Drawcircle(bord));
        repaint();
    }

}
