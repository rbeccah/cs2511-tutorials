package thrones.factories;

import thrones.characters.wood.*;

/*
 * Wooden pieces are large and bulky, and take up a n x n grid, meaning they can only be placed on tiles with x and y values which divide n (n is provided to the factory)
 */
public class WoodFactory extends CharacterFactory {

    public WoodFactory(int dimension) {
        super(dimension);
    }
    
}
