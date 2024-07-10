package thrones;

import java.util.Random;

public class EntityFactory {
    // ? To place characters in a random position, how do we generate random x and y coordinates? 
    // Use Random class, prebuiult into Java
    // Here, Random is seeded with the current time in milliseconds
    // This ensures that with each run of the program, there is a different sequence of random numbers
    // * These results are NOT reproducible
    // private static Random randomGenerator = new Random(System.currentTimeMillis());

    // ! In testing, how do we test this randomness? 
    // * Reproducible results -> set to the same seed
    // The same seed will make the pseudo randomGenerator always produce the same sequence of numbers each time
    private static Random randomGenerator = new Random(42);

    private static int gridSize = 5;

    private static int getRandomCoordinate() {
        // Generates a random integer from 0 to gridSize inclusive
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

    public static Character createTroll() {
        int x = getRandomCoordinate(), y = getRandomCoordinate();
        System.out.printf("Troll created at (%d, %d)\n", x, y);
        return new Troll(x, y);
    }
    
}
