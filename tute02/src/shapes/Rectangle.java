package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // ? Rectangle has 2 constructors. Why? 
    // Sometimes we want to define all attributes in a class upon instantiation, but other times it would be more convenient to only define some
    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    // Method overloading - you have the same name and return type for your method, but different parameters
    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        // ? How does the program know which constructor we are calling? 
        // Through method overloading
        Rectangle r = new Rectangle("red", 10, 20);
    }
}
