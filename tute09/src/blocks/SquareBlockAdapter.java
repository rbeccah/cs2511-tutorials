package blocks;

public class SquareBlockAdapter extends CircleBlock{
    private SquareBlock block;

    public SquareBlockAdapter(SquareBlock block) {
        this.block = block;
    }

    @Override
    public double getRadius() {
        // Method that makes the square block compatible with the CircleHole
        return block.getWidth();
    }
}
