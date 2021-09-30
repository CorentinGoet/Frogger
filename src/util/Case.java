package util;

/**
 * Cette classe correspond aux cases.
 *
 * @author Corentin GOETGHEBEUR
 * @version 1.0
 */
public class Case {
    private int size;

    /**
     * Constructeur de la classe Case précisant une taille.
     * @param size taille
     */
    public Case(int size) {
        this.size = size;
    }

    /**
     * Constructeur de la classe case sans parametres.
     */
    public Case() {
        this.size = 1;
    }

    /**
     * retourne la taille de la case.
     * @return size
     */
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "| " + this.size + " |";
    }
}
