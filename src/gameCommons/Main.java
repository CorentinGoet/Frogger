package gameCommons;

import frog.Frog;
import util.Case;
import util.Road;

public class Main {
    public static void main(String[] args) {
        int length = 15;
        int nb_lanes = 10;

        Frog frog = new Frog(0,5);
        Road road = new Road(nb_lanes, length);

        Game game = new Game(frog, road);
        System.out.println(game.getRoad());

    }
}
