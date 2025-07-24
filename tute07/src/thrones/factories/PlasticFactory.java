package thrones.factories;

import thrones.characters.plastic.*;

/*
 * Plastic pieces are lightweight and can be placed anywhere within a given bound (provided to the factory)
 */
public class PlasticFactory extends CharacterFactory {

    public PlasticFactory(int dimension) {
        super(dimension);
    }
    
}
