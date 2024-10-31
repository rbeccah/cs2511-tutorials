package thrones.decorator;

import thrones.Character;

/*
 * Concrete decorator
 */
public class Helmet extends CharacterDecorator {

    public Helmet(Character wrappee) {
        super(wrappee);
    }

    @Override
    // * STEP 1: Call the damage of the decorator
    public void damage(int points) {
        super.damage(points - 1);
    }

}
