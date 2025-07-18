package thrones.factories;

import java.util.Random;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
public abstract class CharacterFactory {
    private int dimension;
    private Random r = new Random();

    public CharacterFactory(int dimension) {
        this.dimension = dimension;
    }

    public abstract King createKing();
    public abstract Queen createQueen();
    public abstract Knight createKnight();
    public abstract Dragon createDragon();

    public int getDimension() {
        return dimension;
    }

    public int getInt(int bound) {
        return r.nextInt(bound);
    }

    public Random getRandom() {
        return r;
    }
}
