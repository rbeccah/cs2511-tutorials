package thrones.decorator;

import thrones.Character;

/*
 * Concrete decorator
 */
public class Helmet extends CharacterDecorator {

    public Helmet(Character wrappee) {
        super(wrappee);
    }

    // ? How do we reduce the amount of damage inflicted using the decorator? 
    // * STEP 1: Call the super method of damage() in CharacterDecorator
    @Override
    public void damage(int points) {
        super.damage(Math.max(points - 1, 0));
    }
    
}
