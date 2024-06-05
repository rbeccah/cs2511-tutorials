package shapes;

public class Circle extends Shape {
    private int x, y;
    private int r;

    public static int numOfCircles = 0;
    private static final double pi = 3.1415;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
        numOfCircles++;
    }

    public double circumference() {
        return 2 * pi * r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle("red", 0, 0, 1);
        System.out.println(Circle.numOfCircles);

        Circle c2 = new Circle("blue", 0, 0, 1);
        System.out.println(Circle.numOfCircles);
    }
}
