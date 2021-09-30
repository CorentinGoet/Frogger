package util;

import frog.Frog;

/**
 * Cette classe correspond aux cases.
 *
 * @author Corentin GOETGHEBEUR
 * @version 1.0
 */
public class Case {
    private int size;
    private Frog content;

    /**
     * Constructeur de la classe Case précisant une taille.
     * @param size taille
     * @since 1.0
     */
    public Case(int size) {
        this.size = size;
    }

    /**
     * Constructeur de la classe case sans parametres.
     * @since 1.0
     */
    public Case() {
        this.size = 1;
    }

    /**
     * retourne la taille de la case.
     * @return size
     * @since 1.0
     */
    public int getSize() {
        return size;
    }

    /**
     * Retourne le contenu de la case.
     * @return content
     */
    public Frog getContent() {
        return content;
    }

    /**
     * Met a jour le contenu de la case.
     * @param content
     */
    public void setContent(Frog content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if(this.content == null){
            return "      ";
        }else{
            return "|" + this.getContent() + "|";
        }

    }
}
