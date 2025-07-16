package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
public class CharacterFactory {
    private int dimension;

    public CharacterFactory(int dimension) {
        this.dimension = dimension;
    } 

    public int getDimension() {
        return dimension;
    }
}
