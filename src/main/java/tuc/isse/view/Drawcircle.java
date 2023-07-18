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
 * die Klasse zeichnet die Kreise auf der grafischen Oberläche des Spiels
 */
import tuc.isse.model.Bord;
import tuc.isse.model.ObservableBord;

import javax.swing.*;
import java.awt.*;

public class Drawcircle extends JComponent {
    Bord bord ;
    public Drawcircle(ObservableBord bord){
        this.bord = bord;
    }

    protected void paintComponent(Graphics g){

        int x ;
        int y = 30;
        int width = 70;
        int height = 70;
        for(int i = 5; i >= 0; i--){
            x = 0;
            if(i == 5){
                y = 2;
            }
            else {
                y += 70;
            }

            for(int j = 0; j <= 6; j++){
                if(this.bord.getTokenColor(i, j) == tuc.isse.model.Color.RED){
                    g.setColor(Color.RED);
                    g.fillOval(x,y, width, height);
                    x += 70;
                }
                else if (this.bord.getTokenColor(i, j) == tuc.isse.model.Color.YELLOW){
                    g.setColor(Color.YELLOW);
                    g.fillOval(x,y, width, height);
                    x += 70;

                }
                else{
                    g.setColor(Color.WHITE);
                    g.fillOval(x,y, width, height);
                    x += 70;
                }
            }
        }
    }
}
