package thrones.decorator;

import thrones.Character;

/* 
 * Concrete decorators
 */
public class ChainMail extends CharacterDecorator {

    public ChainMail(Character wrappee) {
        super(wrappee);
    }
    
}
