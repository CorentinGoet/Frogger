package gameCommons;

import frog.Frog;
import util.Case;
import util.Direction;
import util.Lane;
import util.Road;

/**
 * Simulation du jeu
 * @author Corentin GOETGHEBEUR
 * version 0.1
 */
public class Game {
    private Frog frog;
    private Road road;

    /**
     * Constructeur pour la classe Game.
     * @param frog Grenouille, personnage à jouer
     * @param road Route, parcours à effectuer pour la grenouille
     */
    public Game(Frog frog, Road road) {
        this.frog = frog;
        this.road = road;
    }

    /**
     * Deplace la grenouille d'une case dans la direction fournie
     * @param direction direction de deplacement
     */
    public void move(Direction direction){
        // empty the current spot
        int x = this.frog.getCoords()[0];
        int y = this.frog.getCoords()[1];
        Lane lane = this.road.getLanes().get(y);
        Case frog_case = lane.getCases().get(x);
        frog_case.setContent(null);

        // move the frog
        this.frog.move(direction);

        // fill new spot
        x = this.frog.getCoords()[0];
        y = this.frog.getCoords()[1];
        Lane new_lane = this.road.getLanes().get(y);
        Case new_frog_case = new_lane.getCases().get(x);
        new_frog_case.setContent(null);

        }

    /**
     * Retourne la grenouille associee.
     * @return frog
     */
    public Frog getFrog() {
        return frog;
    }

    /**
     * Retourne la route associee.
     * @return road
     */
    public Road getRoad() {
        return road;
    }
}
