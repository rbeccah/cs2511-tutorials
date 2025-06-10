package shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }
    
    @Override
    public int getArea() {
        return Math.toIntExact(Math.round(Math.PI * radius * radius));
    }
    
}
