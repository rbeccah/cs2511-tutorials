package thrones;

import java.util.Random;

public abstract class EntityFactory {
    // ? To place characters in a random position, how do we generate random x and y coordinates? 
    private static Random randomGenerator = new Random(4);

    private static int gridSize = 5;

    public static int getRandomCoordinate() {
        // Generating a random integer from 0 (inclusive) to gridSize (exclusive)
        return randomGenerator.nextInt(gridSize);
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

    // Violate the Open-Closed principle in some ways
    // * Method 2: Using refactoring guru's factory
    public abstract Character createCharacter();
}
