package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.plastic.*;

/*
 * Plastic pieces are lightweight and can be placed anywhere within a given bound (provided to the factory)
 */
public class PlasticFactory extends CharacterFactory {
    private int bound;

    public PlasticFactory(int dimension, int bound) {
        super(dimension);
        this.bound = bound;
    }

    @Override
    public King createKing() {
        return new PlasticKing(getInt(bound), getInt(bound));
    }

    @Override
    public Queen createQueen() {
        return new PlasticQueen(getInt(bound), getInt(bound));
    }

    @Override
    public Knight createKnight() {
        return new PlasticKnight(getInt(bound), getInt(bound));
    }

    @Override
    public Dragon createDragon() {
        return new PlasticDragon(getInt(bound), getInt(bound));
    }
    
}
