package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // ? Rectangle has 2 constructors. Why?
    // We can create a Rectangle using different input parameters depending on what the user wants
    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        // ? How does the program know which constructor we are calling? 
        Rectangle r = new Rectangle("red", 10, 20);
    }
}
