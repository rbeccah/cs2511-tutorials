package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // ? Rectangle has 2 constructors. Why? 
    // First constructor default width and height
    public Rectangle(String color) {
        super(color);
        this.width = 1;
        this.height = 1;
        System.out.println("Inside Rectangle constructor with one argument");
    }

    // Method overloading
    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    /**
     * 
     * @param name
     * @param width
     */
    public Rectangle(String name, int width) {
        this(name);
        this.width = width;
        this.height = 1;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    @Override
    public int getArea() {
        return height * width;
    }

    public void printMessage() {
        System.out.println("I am a Rectangle");
    }

    public static void main(String[] args) {
        // ? How does the program know which constructor we are calling? 
        // Essentially it is looking at the input parameters
        // Number and also the type
        Rectangle r = new Rectangle("red", 10, 20); // What will this print?
        Rectangle r2 = new Square("blue", 20);
        System.out.println();

        // ? What will this print out
        r2.printMessage();
        
        System.out.println("Area of r2: " + r2.getArea());

        // ? What will this print out? 
        System.out.println("Number of shapes: " + Shape.getCount());
        // System.out.println("Number of shapes: " + r.getCount());
        // System.out.println("Number of shapes: " + r2.getCount());
    }
}

