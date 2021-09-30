package util;


/**
 * Correspond aux voies de la route.
 *
 * @author Corentin GOETGHEBEUR
 * @version 1.0
 */
public class Lane {
    private int speed;
    private int density;
    private Direction direction;

    /**
     * Constructeur de la classe Lane.
     * @param speed Vitesse de circulation des voitures sur cette voie.
     * @param density Probabilité d'apparition d'une voiture sur cette voie.
     * @param direction Sens de circulation sur cette voie (Direction.left ou Direction.right).
     */
    public Lane(int speed, int density, Direction direction) {
        this.speed = speed;
        this.density = density;
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public Direction getDirection() {
        return direction;
    }

    /**
     * Met à jour le sens de circulation des voitures sur la voie.
     * @param direction sens de circulation
     * @throws IllegalArgumentException La direction fournie pour la voie est incompatible (Direction.up ou Direction.down)
     */
    public void setDirection(Direction direction) {
        if(direction == Direction.down || direction == Direction.up){
            throw(new IllegalArgumentException("Impossible de créer une voie dans cette direction"));
        }else {
            this.direction = direction;
        }
    }
}
