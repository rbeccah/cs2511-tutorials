package thrones;

import java.util.Random;

public class EntityFactory {
    private static Random randomGenerator = new Random(2);

    private static int gridSize = 5;

    public static int getRandomCoordinates() {
        // Generate a random integer from 0 to gridSize - 1
        return randomGenerator.nextInt(gridSize);
    }

    public static Character createKing() {
        int x = getRandomCoordinates(), y = getRandomCoordinates();
        System.out.printf("King created at (%d, %d)\n", x, y);
        return new King(x, y);
    }

    public static Character createQueen() {
        int x = getRandomCoordinates(), y = getRandomCoordinates();
        System.out.printf("Queen created at (%d, %d)\n", x, y);
        return new Queen(x, y);
    }

    public static Character createKnight() {
        int x = getRandomCoordinates(), y = getRandomCoordinates();
        System.out.printf("Knight created at (%d, %d)\n", x, y);
        return new Knight(x, y);
    }

    public static Character createDragon() {
        int x = getRandomCoordinates(), y = getRandomCoordinates();
        System.out.printf("Dragon created at (%d, %d)\n", x, y);
        return new Dragon(x, y);
    }

    // Open-Closed principle
}
