package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.metal.*;

/*
 * Metal pieces are heavy and hence can only be set with 0 <= x <= 5, and y = 0
 */
public class MetalFactory extends CharacterFactory {
    private static final int BOUND = 5;
    private static final int Y_VALUE = 0;

    public MetalFactory(int dimension) {
        super(dimension);
    }

    @Override
    public King createKing() {
        return new MetalKing(getInt(BOUND), Y_VALUE);
    }
    @Override
    public Queen createQueen() {
        return new MetalQueen(getInt(BOUND), Y_VALUE);
    }
    @Override
    public Knight createKnight() {
        return new MetalKnight(getInt(BOUND), Y_VALUE);
    }
    @Override
    public Dragon createDragon() {
        return new MetalDragon(getInt(BOUND), Y_VALUE);
    }


}
