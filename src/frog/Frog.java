package frog;


/**
 * Classe modelisant la grenouille.
 */
public class Frog {
    private int lane;
    private int current_case;

    /**
     * Constructeur de la classe Frog
     * @param lane voie sur laquelle la grenouille se trouve
     * @param current_case case de la voie ou se trouve la grenouille
     */
    public Frog(int lane, int current_case) {
        this.lane = lane;
        this.current_case = current_case;
    }

    /**
     * Retourne les coordonnées de la grenouille (case, lane)
     * @return coords
     */
    public int[] getCoords(){
        int[] coords = new int[2];
        coords[0] = this.current_case;
        coords[1] = this.lane;
        return coords;
    }

    @Override
    public String toString() {
        return ",'O',";
    }
}
