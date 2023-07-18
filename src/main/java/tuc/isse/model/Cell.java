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
package tuc.isse.model;

/**
 * @author Uriel Delmas Teponou Wamba und Kailas Sargar
 * diese Klasse gestaltet alle einzelnen Zelle des Bretts
 */
public class Cell extends GameObjekt {
    private Token token;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;


    }

    @Override
    public String toString() {
        if(this.token == null){
            return "[ ]";
        }
        else {
            return "[" + token.toString() + "]";
        }

    }
}
