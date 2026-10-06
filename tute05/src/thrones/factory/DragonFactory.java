package thrones.factory;

import thrones.EntityFactory;
import thrones.Character;
import thrones.King;

public class DragonFactory extends EntityFactory {

    @Override
    public Character createCharacter() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("King created at (%d, %d)", x, y);
        return new King(x, y);
    }
    
}
