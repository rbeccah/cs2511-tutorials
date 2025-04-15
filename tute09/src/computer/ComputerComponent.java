package computer;

// * Element interface
public interface ComputerComponent {
    // Declares a method for accepting visitors
    public void accept(ComputerVisitor visitor);
}


