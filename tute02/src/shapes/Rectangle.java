package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color);
        this.width = 1;
        this.height = 1;
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    @Override
    public int getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20); // What will this print?
        Rectangle r2 = new Square("blue", 20);
        System.out.println(r2.getArea());
        System.out.println(Shape.getCount());
    }
}

