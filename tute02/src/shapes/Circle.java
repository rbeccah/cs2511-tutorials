package shapes;

public class Circle {
    private int x, y;
    private double radius;

    // static - belongs to the class rather than any singlaur instance
    public static int numOfCircles = 0;

    // final - upon instantialising, the variable cannot be changed
    private static final double PI = 3.14159;

    /**
     * Constructor for Circle
     * @param x
     * @param y
     * @param radius
     */
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        numOfCircles++;
    }

    // public static getNumOfCircles() {
    //     return numOfCircles;
    // }

    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5);
        System.out.println("Number of circles: " + Circle.numOfCircles);

        Circle c2 = new Circle(1, 1, 10);
        System.out.println("Number of circles: " + Circle.numOfCircles);
    }
}
