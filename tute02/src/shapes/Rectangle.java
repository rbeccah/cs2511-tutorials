package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // ? Why are there 2 constructors? 
    // Sometmes we want to define all the attributes of a class, but other times it would be more conveninet to set only some
    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    // * Method Overloading
    // Functions with the exame same name and return type but different input parameters
    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);
    }
}
