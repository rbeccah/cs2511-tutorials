package thrones;

import java.util.Random;

public class EntityFactory {
    private static Random randomGenerator = new Random(System.currentTimeMillis());

    private static int gridSize = 5;

    public static int getRandomCoordinates() {
        // Generates a random integer from 0 to gridSize - 1 inclusive
        return randomGenerator.nextInt(gridSize - 1);
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

    // .... do the same with knight and dragon
}
