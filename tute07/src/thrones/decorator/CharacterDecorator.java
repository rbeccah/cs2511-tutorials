package thrones.decorator;

import java.util.List;

import thrones.Character;
import thrones.MoveResult;

/*
 * Base Decorator class which all decorators inherit from
 */
public class CharacterDecorator implements Character {
    private Character wrappee;

    public CharacterDecorator(Character wrappee) {
        this.wrappee = wrappee;
    }

    // Method forwarding
    @Override
    public int getHealthPoints() {
        return wrappee.getHealthPoints();
    }

    @Override
    public int getX() {
        return wrappee.getX();
    }

    @Override
    public int getY() {
        return wrappee.getY();
    }

    @Override
    public void setX(int x) {
        wrappee.setX(x);
    }

    @Override
    public void setY(int y) {
        wrappee.setY(y);
    }

    // * STEP 2: Call the wrappee classes' damage() method
    @Override
    public void damage(int points) {
        wrappee.damage(points);
    }

    @Override
    public void attack(Character victim) {
        wrappee.attack(victim);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return wrappee.canMove(dx, dy);
    }


}
