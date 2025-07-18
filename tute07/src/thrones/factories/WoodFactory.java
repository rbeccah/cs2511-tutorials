package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.wood.*;

/*
 * Wooden pieces are large and bulky, and take up a n x n grid, meaning they can only be placed on tiles with x and y values which divide n (n is provided to the factory)
 */
public class WoodFactory extends CharacterFactory {
    private int n;

    public WoodFactory(int dimension, int n) {
        super(dimension);
        this.n = n;
    }

    public int getIntDivisiblyBy() {
        int random = getInt(getDimension());

        // Divides by n using floor division to get a whole number quotient
        int quotient = Math.floorDiv(random, n);

        return quotient * n;
    }

    @Override
    public King createKing() {
        return new WoodKing(getIntDivisiblyBy(), getIntDivisiblyBy());
    }

    @Override
    public Queen createQueen() {
        return new WoodQueen(getIntDivisiblyBy(), getIntDivisiblyBy());
    }

    @Override
    public Knight createKnight() {
        return new WoodKnight(getIntDivisiblyBy(), getIntDivisiblyBy());
    }

    @Override
    public Dragon createDragon() {
        return new WoodDragon(getIntDivisiblyBy(), getIntDivisiblyBy());
    }
    
}
