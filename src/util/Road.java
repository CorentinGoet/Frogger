package util;

import frog.Frog;

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
     * Constructeur comprenant le placement de la grenouille.
     * @param nbLanes nombre de voies
     * @param length longueur des voies
     * @param frog grenouille
     */
    public Road(int nbLanes, int length, Frog frog) {
        this.nbLanes = nbLanes;
        this.length = length;
        this.init_lanes();
        this.initFrog(frog);
    }

    public void initFrog(Frog frog){

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
        for (int i = this.nbLanes-1; i >= 0; i--){
            s += this.lanes.get(i).toString();
            s += "\n";
        }
        return s;
    }

    public ArrayList<Lane> getLanes() {
        return lanes;
    }

    public void setLanes(ArrayList<Lane> lanes) {
        this.lanes = lanes;
    }

    public int getNbLanes() {
        return nbLanes;
    }

    public int getLength() {
        return length;
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
