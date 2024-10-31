package thrones;

import java.util.Random;

public abstract class EntityFactory {
    // ? To place characters in a random position, how do we generate random x and y coordinates? 
    // Use Random class
    // * For true randomness, we can use current time in milliseconds
    // * This randomness will be NOT reproducible
    private static Random randomGenerator = new Random(System.currentTimeMillis());

    private static int gridSize = 5;

    public static int getRandomCoordinate() {
        // Generates a random integer from 0 to gridSize inclusive
        return randomGenerator.nextInt(gridSize);
    }

    public static Character createKing() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("King created at (%d, %d)\n", x, y);
        return (Character) new King(x, y);
    }

    public static Character createQueen() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Queen created at (%d, %d)\n", x, y);
        return (Character) new Queen(x, y);
    }

    public static Character createKnight() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Knight created at (%d, %d)\n", x, y);
        return (Character) new Knight(x, y);
    }

    public static Character createDragon() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Dragon created at (%d, %d)\n", x, y);
        return (Character) new Dragon(x, y);
    }

    // * Open-Closed Principle
    // Technically, this factory vioilates OCP 

    // * Method 2: Factory Pattern from refactoring guru
    public abstract Character createCharacter();
}
