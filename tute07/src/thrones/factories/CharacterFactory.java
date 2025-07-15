package thrones.factories;

public class CharacterFactory {
    private int dimension;

    public CharacterFactory(int dimension) {
        this.dimension = dimension;
    } 

    public int getDimension() {
        return dimension;
    }
}
