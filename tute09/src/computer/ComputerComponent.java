package computer;

public interface ComputerComponent {
    // Declares a method for accepting visitors
    public void accept(ComputerVisitor visitor);
}


