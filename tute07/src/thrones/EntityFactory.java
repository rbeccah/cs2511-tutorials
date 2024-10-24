package thrones;

import java.util.Random;

public abstract class EntityFactory {
    // ? To place characters in a random position, how do we generate random x and y coordinates? 
    // Use Random class
    // We want true randomness 
    private static Random randomGenerator = new Random(System.currentTimeMillis());

    private static int gridSize = 5;

    public static int getRandomCoordinate() {
        // Generate a random integer from 0 to gridSize inclusive
        return randomGenerator.nextInt(gridSize - 1);
    }

    public static Character createKing() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("King created at (%d, %d)\n", x, y);
        return new King(x, y);
    }

    public static Character createQueen() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Queen created at (%d, %d)\n", x, y);
        return new Queen(x, y);
    }

    public static Character createKnight() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Knight created at (%d, %d)\n", x, y);
        return new Knight(x, y);
    }

    public static Character createDragon() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Dragon created at (%d, %d)\n", x, y);
        return new Dragon(x, y);
    }

    // * Method 2: Making a factory class for each character
    public abstract Character createCharacter();
    
}
