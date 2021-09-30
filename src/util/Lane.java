package util;


import java.util.ArrayList;

/**
 * Cette classe correspond aux voies de la route.
 *
 * @author Corentin GOETGHEBEUR
 * @version 1.0
 */
public class Lane {
    private int speed;
    private int density;
    private Direction direction;
    private int length;
    private ArrayList<Case> cases;

    /**
     * Constructeur de la classe Lane.
     * @param speed  Vitesse de circulation des voitures sur cette voie.
     * @param density Probabilite d'apparition d'une voiture sur cette voie.
     * @param direction Sens de circulation sur cette voie (Direction.left ou Direction.right).
     */
    public Lane(int speed, int density, Direction direction, int length) {
        this.speed = speed;
        this.density = density;
        this.setDirection(direction);
        this.init_cases();
    }

    /**
     * Retourne la vitesse de circulation sur cette voie.
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Met a jour la vitesse de circulation sur cette voie.
     * @param speed vitesse
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Retourne la probabilité d'apparition d'une voiture sur cette voie.
     * @return density
     */
    public int getDensity() {
        return density;
    }

    /**
     * Met a jour la probabilite d'apparition d'une voiture sur cette voie.
     * @param density
     */
    public void setDensity(int density) {
        this.density = density;
    }

    /**
     * Retourne la direction de circulation sur cette voie.
     * @return direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Met a jour le sens de circulation des voitures sur la voie.
     * @param direction sens de circulation
     * @throws IllegalArgumentException La direction fournie pour la voie est incompatible (Direction.up ou Direction.down)
     */
    public void setDirection(Direction direction) {
        if(direction == Direction.down || direction == Direction.up){
            throw(new IllegalArgumentException("Impossible de creer une voie dans cette direction"));
        }else {
            this.direction = direction;
        }
    }

    /**
     * Methode de creation de la liste des cases pour la voie.
     */
    public void init_cases(){
        for(int i = 0; i < this.length; i++){
            Case new_case = new Case();
            cases.add(new_case);
        }
    }
}
