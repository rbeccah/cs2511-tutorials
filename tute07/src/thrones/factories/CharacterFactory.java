package thrones.factories;

import java.util.Random;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;

public abstract class CharacterFactory {
    private Random r = new Random();
    // Dimension of the board 10 x 10
    private int dimension;

    public CharacterFactory(int dimension) {
        this.dimension = dimension;
    } 

    public int getDimension() {
        return dimension;
    }

    public abstract King createKing();
    public abstract Queen createQueen();
    public abstract Knight createKnight();
    public abstract Dragon createDragon();

    public int getInt(int bound) {
        return r.nextInt(bound);
    }

    public Random getRandom() {
        return r;
    }
}
