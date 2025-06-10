package shapes;

public abstract class Shape {
    private String colour;

    private static int count = 0;

    public Shape(String colour) {
        System.out.println("Inside Shape constructor");
        this.colour = colour;
        count++;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static int getCount() {
        return count;
    }

    public abstract int getArea();

}
