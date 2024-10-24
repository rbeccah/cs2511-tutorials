package thrones.decorator;

import thrones.Character;

/*
 * Concrete decorator
 */
public class ChestPlate extends CharacterDecorator {

    public ChestPlate(Character wrappee) {
        super(wrappee);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.min(points, 7));
    }

    @Override
    public boolean canMove(int dx, int dy) {
        if (dx + dy <= 3)
            return super.canMove(dx, dy);
        else
            return false;
    }
    
}
