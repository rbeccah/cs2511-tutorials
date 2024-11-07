package computer;

// * Concrete element
public class Mouse implements ComputerComponent {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
    
}