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
 * diese Klasse dient als Brett, auf dem das gesamte Spiel stattfinden wird
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bord extends GameObjekt {
    Stack<Token> lager_red = new Stack<Token>();
    Stack<Token> lager_yellow = new Stack<Token>();
    public Bord() {
        this.cells = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < 7; j++) {
                row.add(new Cell());
            }
            this.cells.add(row);
        }
        for(int i = 0; i < 21; i++){
            this.lager_red.push(new Token(Color.RED));
            this.lager_yellow.push(new Token(Color.YELLOW));
        }
    }

    private final List<List<Cell>> cells;

    public Token getToken(Color color){
        if(color == Color.RED) {
            if(hasToken(color))return  lager_red.pop();
        }
        else {
            if(hasToken(color))return lager_yellow.pop();
        }
        return null;
    }
    public boolean hasToken(Color color){
        if(color == Color.RED){
            return !lager_red.empty();
        }
        else {
            return !lager_yellow.empty();
        }
    }

    private boolean isTie() {
        int count = 0;
        for (List<Cell> cell : cells) {
            for (Cell value : cell) {
                if (value.getToken() != null) count += 1;
            }
        }
        return count == 42;
    }

    public void dropToken(Token token, int columnIndex) throws ColumnFullException, IllegalMoveException {
        if (testVictory() != Winner.NONE) throw new IllegalMoveException("Das Spiel ist fertig");
        if (columnIndex < 0 || columnIndex >= cells.get(0).size()) throw new IllegalArgumentException("Ungültiger Spaltenindex");
        int i = 0;
        while (i < cells.size()) {
            if (canDrop(columnIndex)) {
                if (cells.get(i).get(columnIndex).getToken() == null) {
                    cells.get(i).get(columnIndex).setToken(token);
                    System.out.println(toString());
                    if (testVictory() != Winner.NONE){
                        if(testVictory() == Winner.RED){
                            System.out.println("And the winner is: X");
                            break;
                        }
                        else if(testVictory() == Winner.YELLOW){
                            System.out.println("And the winner is: O");
                            break;
                        }
                        else{
                            System.out.println("Niemand hat gewonnen : Das Spiel ist fertig");
                            break;
                        }
                    }
                    break;
                } else {
                    i++;
                }
            } else {
                throw new ColumnFullException("Die Spalte ist voll");
            }
        }
    }

    private boolean canDrop(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < cells.get(0).size()) {
            for (List<Cell> row : cells) {
                if (row.get(columnIndex).getToken() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isRowVictory(Color color) {
        for (List<Cell> cell : cells) {
            int count = 0;
            for (Cell value : cell) {
                if (value.getToken() != null && value.getToken().getColor() == color) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    private boolean isColumnVictory(Color color) {
        for (int col = 0; col < cells.get(0).size(); col++) {
            int count = 0;
            for (List<Cell> cell : cells) {
                if (cell.get(col).getToken() != null && cell.get(col).getToken().getColor() == color) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    private boolean isDiagonalVictory(Color color){

        for (int n = 0; n < cells.size(); n++){
            int i = n;
            int j = 0;
            int counter = 0;
            while (i < cells.size() && j < cells.get(1).size()){
                if(cells.get(i).get(j).getToken() != null){
                    if(cells.get(i).get(j).getToken().getColor() == color ){
                        counter += 1;
                    }
                    else {
                        counter = 0;
                    }
                }
                if(counter == 4) {
                    return true;
                }
                i++;
                j++;
            }
        }

        for (int n = 0; n < cells.get(1).size(); n++){
            int i = 0;
            int j = n;
            int counter = 0;
            while (i < cells.size() && j < cells.get(1).size()){
                if(cells.get(i).get(j).getToken() != null){
                    if(cells.get(i).get(j).getToken().getColor() == color ){
                        counter += 1;
                    }
                    else {
                        counter = 0;
                    }
                }
                if(counter == 4){
                    return true;
                }
                i++;
                j++;
            }
        }

        for (int n = 0; n < cells.size(); n++){
            int i = n;
            int j = cells.get(1).size() - 1;
            int counter = 0;
            while (i < cells.size() && j >= 0){
                if(cells.get(i).get(j).getToken() != null){
                    if(cells.get(i).get(j).getToken().getColor() == color ){
                        counter += 1;
                    }
                    else {
                        counter = 0;
                    }
                }
                if(counter == 4) {
                    return true;
                }
                i++;
                j--;
            }
        }


        for (int n = cells.get(1).size() - 1; n >= 0; n--){
            int i = 0;
            int j = n;
            int counter = 0;
            while (i < cells.size() && j >= 0){
                if(cells.get(i).get(j).getToken() != null){
                    if(cells.get(i).get(j).getToken().getColor() == color ){
                        counter += 1;
                    }
                    else {
                        counter = 0;
                    }
                }
                if(counter == 4){
                    return true;
                }
                i++;
                j--;
            }
        }

        return false;
    }

    public Winner testVictory(){
        if(isRowVictory(Color.RED) || isColumnVictory(Color.RED) || isDiagonalVictory(Color.RED)){
            return Winner.RED;
        }
        else if (isRowVictory(Color.YELLOW) || isColumnVictory(Color.YELLOW) || isDiagonalVictory(Color.YELLOW)) {
            return Winner.YELLOW;
        }
        else if(isTie())  {
            return Winner.TIE;
        }
        return Winner.NONE;
    }


    @Override
    public String toString() {
        StringBuilder brett = new StringBuilder();
        brett.append("\n");
        for (int i = cells.size() - 1; i >= 0; i--) {
            for (int j = 0; j < cells.get(i).size(); j++) {
                brett.append(cells.get(i).get(j).toString()).append(" ");
            }
            brett.append("\n");
        }
        brett.append("[0] [1] [2] [3] [4] [5] [6]\n");
        return brett.toString();
    }
}
