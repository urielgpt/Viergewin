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
 * die Klasse implementiert eine interaktive doTurn-Methode.
 */
import tuc.isse.model.Bord;
import tuc.isse.model.Color;
import tuc.isse.model.ColumnFullException;
import tuc.isse.model.IllegalMoveException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsolePlayer extends Player {
    public ConsolePlayer(Color color, Bord bord) {
        super(color, bord);
    }

    @Override
    public void doTurn() throws ColumnFullException, IllegalMoveException, IOException {
        BufferedReader consoleReader;
        String input ;
        if(getColor() == Color.RED) {
            System.out.print("Spieler X, was ist\ndein nächster Zug?\nEingabe: ");
        }
        else {
            System.out.print("Spieler O, was ist\ndein nächster Zug?\nEingabe: ");
        }
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        input = consoleReader.readLine();
        super.doDrop(Integer.parseInt(input));
    }
}