package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    // ? Rectangle has 2 constructors. Why? 
    // Sometimes we want to define all attributes of a class, but other times it would be more convenient to only define some upon instantialising 
    // Method overloading
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
        // Through method overloading, it is able to identify the correct constructor by the input parameter type and number
        Rectangle r = new Rectangle("red", 10, 20); // What will this print?

        // ? What is happening in this line? 
        Rectangle r2 = new Square("blue", 20);
        System.out.println();
        
        System.out.println("Area of r2: " + r2.getArea());

        // ? What will this print out? 
        // 2
        System.out.println("Number of shapes: " + Shape.getCount());
    }
}

