package computer;

// * Visitor class
// Declares a set of visiting methods that can take concrete elements as arguments
// Implement diff versions of logging messages, tailored for different concrete element classes
public class ComputerVisitor {
    private boolean validated;

    // Visit method for Computer
    public void visit(Computer computer) {
        System.out.println("Looking at computer " + computer.toString() + " with memory " + computer.getMemory() + "GB.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Looking at keyboard " + keyboard.toString() + " which has " + keyboard.getNumKeys() + "keys.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Looking at mouse " + mouse.toString() + ".");
    }

    // Validates the user
    public void validate() {
        this.validated = true;
    }

    // Check if the visitor is validated
    public boolean checkValidated() {
        return validated;
    }

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();

        visitor.validate();
        computer.accept(visitor);

    }

}