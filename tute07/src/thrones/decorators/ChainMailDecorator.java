package thrones.decorators;

import thrones.Character;

public class ChainMailDecorator extends CharacterDecorator {

    public ChainMailDecorator(Character character) {
        super(character);
    }

    // * STEP 2: Goes to CharacterDecorator superclass damage(), but now the input parameters points / 2
    @Override
    public void damage(int points) {
        super.damage(points / 2);
    }

}
