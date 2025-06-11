package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // ? Rectangle has 2 constructors. Why? 
    // Is the different number of parameters
    // For the user depending on how they want to instantialise the Rectangle
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
        // ? How does the program know which constructor we are calling?
        // Method overloading, based on the number parameters and the type
        // ? What will this print? 
        Rectangle r = new Rectangle("red", 10, 20);
        Rectangle r2 = new Square("blue", 20);
        
        System.out.println(r2.getClass());

        System.out.println("Area of r2: " + r2.getArea());
        // ? What will this print out? 
        System.out.println("Number of shapes: " + Shape.getCount());
    }
}

