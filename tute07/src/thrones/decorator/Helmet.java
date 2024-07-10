package thrones.decorator;

import thrones.Character;

public class Helmet extends CharacterDecorator {

    public Helmet(Character wrappee) {
        super(wrappee);
        //TODO Auto-generated constructor stub
    }

    // * STEP 1: Calls the super method of damage() in CharacterDecorator
    @Override
    public void damage(int points) {
        super.damage(points - 1);
    }
    
}
