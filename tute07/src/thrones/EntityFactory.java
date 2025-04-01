package thrones;

import java.util.Random;

public abstract class EntityFactory {
    // ? To place characters in a random position, how do we generate random x and y coordinates? 
    // Use the Random class 
    // * Using current time in milliseconds is not reproducible
    private static Random randomGenerator = new Random(System.currentTimeMillis());

    private static int gridSize = 5;

    public static int getRandomCoordinate() {
        // Generate a random integer from 0 to gridSize inclusive
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

    // * To NOTE: 
    // Technically this does violate the open-closed principle, however we can fix this using an alternative 
    // Factory Pattern method that involves creating a factory for each character

    // Though, you can weigh the pros and cons of both methods

    // * Method 2: Using Factory Pattern
    public abstract Character createCharacter();
}
