package thrones;

import java.util.Random;

public abstract class EntityFactory {
    // ? To place characters in a random position? 
    // * Using current time in milliseconds 
    private static Random randomGenerator = new Random(System.currentTimeMillis());

    private final static int GRID_SIZE = 5;

    public static int getRandomCoordinate() {
        // Generates a random integer from 0 to grid_size inclusive
        return randomGenerator.nextInt(GRID_SIZE - 1);
    }

    public static Character createKing() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("King created at (%d, %d)\n", x, y);
        return new King(x, y);
    }

    public static Character createKnight() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Knight created at (%d, %d)\n", x, y);
        return new Knight(x, y);
    }

    public static Character createQueen() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Queen created at (%d, %d)\n", x, y);
        return new Queen(x, y);
    }

    public static Character createDragon() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Dragon created at (%d, %d)\n", x, y);
        return new Dragon(x, y);
    }

    // * Technically, each time we create a character we always modifyign this class
    // Open-Closed principle

    // * Method 2: Using Factory patter from refactoring guru
    public abstract Character creatCharacter();
}
