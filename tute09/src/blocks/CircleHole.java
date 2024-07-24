package blocks;

/**
 * Similar to the existing client system. 
 */

public class CircleHole {
    private double radius;

    public CircleHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(CircleBlock block) {
        return this.getRadius() >= block.getRadius();
    }
}
