package thrones.decorators;

import thrones.Character;

public class HelmetDecorator extends CharacterDecorator {

    public HelmetDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.max(points - 1, 0));
    }

}
