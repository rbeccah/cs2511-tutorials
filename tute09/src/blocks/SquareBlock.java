package blocks;

/**
 * SquareBlocks are not compatible with CircleHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */

public class SquareBlock {
    private double width;

    public SquareBlock(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return Math.pow(this.width, 2);
    }
}
