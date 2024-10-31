package thrones.decorator;

import thrones.Character;

/*
 * Concrete decorator
 */
public class ChainMail extends CharacterDecorator {

    public ChainMail(Character wrappee) {
        super(wrappee);
    }
    
    @Override
    public void damage(int points) {
        super.damage(points / 2);
    }
}
