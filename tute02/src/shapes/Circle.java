package shapes;

public class Circle {
    // Centre coordinates of circle
    private int x, y;
    // Radius of circle
    private int r;

    private static final double PI = 3.1415;

    public int numOfCircles = 0;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
        numOfCircles++;
    }

    // Calculate the circumference
    public double circumference() {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 1);
        System.out.println(c1.numOfCircles);

        Circle c2 = new Circle(0, 0, 1);
        System.out.println(c2.numOfCircles);
    }
}
