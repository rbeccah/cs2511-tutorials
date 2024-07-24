package blocks;

/**
 * CircleHoles are compatible with CircleBlocks.
 * Similar to the Client Interface which other classes must follow to collaborate with Client
 */

public class CircleBlock {
    private double radius;

    public CircleBlock() {}

    public CircleBlock(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
