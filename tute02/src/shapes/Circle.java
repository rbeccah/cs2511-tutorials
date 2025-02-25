package shapes;

public class Circle {
    private int x, y;
    private double radius;
    // static - belongs to the class rather than any singular instance
    // final - upon instantialising, the variable cannot be modified or extended
    private static final double PI = 3.14159;
    private static int numOfCircles = 0;
    
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        numOfCircles++;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 2);
        System.out.println("Number of circles: " + Circle.numOfCircles);

        Circle c2 = new Circle(0, 0, 2);
        System.out.println("Number of circles: " + Circle.numOfCircles);
    }
}
