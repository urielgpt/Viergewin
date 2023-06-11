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
        int i = 0;
        while( i < cells.length ){
            boolean b = canDrop(columnIndex);
            if (b) {
                if(cells[i][columnIndex].getToken() == null){
                    cells[i][columnIndex].setToken(new Token(color));
                    System.out.println(toString());
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

    @Override
    public String toString() {
        StringBuilder Brett = new StringBuilder();
        for (int i = cells.length -1; i >= 0; i--) {
            for (int j = 0; j < cells[i].length; j++) {
                Brett.append(cells[i][j].toString()).append(" ");
            }
            Brett.append("\n");
        }
        return Brett.toString();
    }
}
