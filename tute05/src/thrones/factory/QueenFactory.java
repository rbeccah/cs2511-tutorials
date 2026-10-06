package thrones.factory;

import thrones.EntityFactory;
import thrones.Queen;
import thrones.Character;

public class QueenFactory extends EntityFactory {

    @Override
    public Character createCharacter() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("King created at (%d, %d)", x, y);
        return new Queen(x, y);
    }
    
}
