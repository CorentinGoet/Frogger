package util;

import java.util.ArrayList;

/**
 * Cette classe correspond à la route.
 *
 * @author Corentin GOETGHEBEUR
 * @version 1.0
 */
public class Road {
    private int nbLanes;
    private int length;
    private ArrayList<Lane> lanes;

    /**
     * Constructeur de la classe Road.
     * @param nbLanes Nombre de voies.
     * @param length Longueur des voies.
     * @since 1.0
     */
    public Road(int nbLanes, int length) {
        this.nbLanes = nbLanes;
        this.length = length;
        this.init_lanes();
    }

    /**
     * Methode d'initialisation de la liste des voies.
     */
    private void init_lanes(){
        this.lanes = new ArrayList<>();
        for(int i = 0; i < this.nbLanes; i++){

            Lane new_lane = new Lane(5, 2, Direction.left, this.length);
            lanes.add(new_lane);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.nbLanes; i++){
            s += this.lanes.get(i).toString();
            s += "\n";
        }
        return s;
    }

    /**
     * Methode de tests de la classe Road.
     * @param args
     */
    public static void main(String[] args) {
        int nb_lanes = 5;
        int length = 15;
        Road road = new Road(nb_lanes, length);
        System.out.println(road);
    }
}
