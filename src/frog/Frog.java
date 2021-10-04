package frog;


import util.Direction;

/**
 * Classe modelisant la grenouille.
 */
public class Frog {
    private int x;
    private int y;

    /**
     * Constructeur de la classe Frog
     * @param lane voie sur laquelle la grenouille se trouve
     * @param current_case case de la voie ou se trouve la grenouille
     */
    public Frog(int lane, int current_case) {
        this.x = lane;
        this.y = current_case;
    }

    /**
     * Retourne les coordonnées de la grenouille (case, lane)
     * @return coords
     */
    public int[] getCoords(){
        int[] coords = new int[2];
        coords[0] = this.y;
        coords[1] = this.x;
        return coords;
    }

    /**
     * Change les coordonnees de la grenouilles dans la direction donnee
     * @param direction direction de deplacement.
     * @throws IllegalArgumentException l'argument n est pas une direction
     */
    public void move(Direction direction){
        switch (direction){
            case up:
                this.x += 1;
                break;
            case down:
                this.x -= 1;
                break;
            case left:
                this.y -= 1;
                break;
            case right:
                this.y += 1;
                break;
            default:
                throw new IllegalArgumentException("Is " + direction.toString() +" a direction ? ");
        }
    }

    @Override
    public String toString() {
        String s = "";
        s += this.getCoords()[0];
        s += "/";
        s += this.getCoords()[1];
        return s;
    }

    /**
     * Methode de test de la classe Frog
     * @param args args
     */
    public static void main(String[] args) {
        Frog frog = new Frog(0,0);
        System.out.println(frog);
        frog.move(Direction.down);
        System.out.println(frog);
        frog.move(Direction.left);
        System.out.println(frog);
        frog.move(Direction.right);
        frog.move(Direction.up);
        System.out.println(frog);
    }
}
