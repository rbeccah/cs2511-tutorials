package thrones.decorator;

import thrones.Character;

/*
 * Concrete decorator
 */
public class ChainMail extends CharacterDecorator {

    public ChainMail(Character wrappee) {
        super(wrappee);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void damage(int points) {
        super.damage(points / 2);
    }
    
}
