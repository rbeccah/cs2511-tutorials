package blocks;

public class BlockSystem {
    public static void main(String[] args) {
        CircleHole hole = new CircleHole(5);
        CircleBlock circleBlock = new CircleBlock(5);
        if (hole.fits(circleBlock)) {
            System.out.println("Round block with radius 5 fits round hole with radius 5");
        }

        SquareBlock smSquareBlock = new SquareBlock(1);
        SquareBlock lgSquareBlock = new SquareBlock(20);
        // hole.fits(smSquareBlock);   // wont compile

        // Adapter solves the problem
        SquareBlockAdapter smSquareBlockAdapter = new SquareBlockAdapter(smSquareBlock);
        if (hole.fits(smSquareBlockAdapter)) {
            System.out.println("Square block with width 2 fits in round hole");
        }
    }
}
