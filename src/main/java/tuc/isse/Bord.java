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

public class Bord extends GameObjekt {
    public Bord() {
        this.cells = new Cell[6][7];
        for (int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell();
            }
        }
    }
    private final Cell[][] cells;
    public void dropToken(Color color, int columnIndex) throws ColumnFullException {
        if(testVictory()!= Winner.NONE){
            return;
        }
        int i = 0;
        while( i < cells.length ){
            boolean b = canDrop(columnIndex);
            if (b) {
                if(cells[i][columnIndex].getToken() == null){
                    cells[i][columnIndex].setToken(new Token(color));
                    System.out.println(toString());
                    if(testVictory()!= Winner.NONE){
                        return;
                    }
                    break;
                }
                else{
                    i++;
                }
            }
            else throw new ColumnFullException("Die Spalte ist voll");
        }
    }
    private boolean canDrop(int columnIndex) {
        int i = 0;
        if (columnIndex >= 0 && columnIndex <= 7) {
            while (i < cells.length){
                if(cells[i][columnIndex].getToken() == null){
                    return true;
                }
                else {
                    i++;
                }
            }
        }
        return false;
    }

    private boolean isRowVictory(Color color) {
        for (Cell[] cell : cells) {
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
        for (int col = 0; col < cells[0].length; col++) {
            int count = 0;
            for (Cell[] cell : cells) {
                if (cell[col].getToken() != null && cell[col].getToken().getColor() == color) {
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

        for (int n = 0; n < cells.length; n++){
            int i = n;
            int j = 0;
            int counter = 0;
            while (i < cells.length && j < cells[1].length){
                if(cells[i][j].getToken() != null){
                    if(cells[i][j].getToken().getColor() == color ){
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

        for (int n = 0; n < cells[1].length; n++){
            int i = 0;
            int j = n;
            int counter = 0;
            while (i < cells.length && j < cells[1].length){
                if(cells[i][j].getToken() != null){
                    if(cells[i][j].getToken().getColor() == color ){
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

        for (int n = 0; n < cells.length; n++){
            int i = n;
            int j =cells[1].length - 1;
            int counter = 0;
            while (i < cells.length && j >= 0){
                if(cells[i][j].getToken() != null){
                    if(cells[i][j].getToken().getColor() == color ){
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


        for (int n = cells[1].length - 1; n >= 0; n--){
            int i = 0;
            int j = n;
            int counter = 0;
            while (i < cells.length && j >= 0){
                if(cells[i][j].getToken() != null){
                    if(cells[i][j].getToken().getColor() == color ){
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
            System.out.println("Der Spieler mit der Farbe Rot hat gewonnen");
            return Winner.RED;


        } else if (isRowVictory(Color.YELLOW) || isColumnVictory(Color.YELLOW) || isDiagonalVictory(Color.YELLOW)) {
            System.out.println("Der Spieler mit der Farbe Gelb hat gewonnen");
            return Winner.YELLOW;
        }
        return Winner.NONE;
    }
    @Override
    public String toString() {
        StringBuilder brett = new StringBuilder();
        for (int i = cells.length -1; i >= 0; i--) {
            for (int j = 0; j < cells[i].length; j++) {
                brett.append(cells[i][j].toString()).append(" ");
            }
            brett.append("\n");
        }
        return brett.toString();
    }
}
