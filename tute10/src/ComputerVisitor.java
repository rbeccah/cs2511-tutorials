// * Visitor class
// Declare a set of visiting mthods that can take concrete elements as arguments
// Implement several versions of logging messages functionality
public class ComputerVisitor {
    private boolean validated;

    // Visitor method for Computer
    public void visit(Computer computer) {
        System.out.println("Looking at computer " + computer.toString() + " with memory " + computer.getMemory() + " GB.");
    }

    // Visitor method for Keyboard
    public void visit(Keyboard keyboard) {
        System.out.println("Looking at keyboard " + keyboard.toString() + " which has " + keyboard.getNumKeys() + " keys.");
    }

    // Visitor method for Mouse
    public void visit(Mouse mouse) {
        System.out.println("Looking at mouse " + mouse.toString());
    }

    // Validates the user
    public void validate() {
        this.validated = true;
    }

    // Check if the user is validated
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

        keyboard.accept(visitor);
        mouse.accept(visitor);

        // ? When to use Visitor pattern? 
        // Useful for operations on complex object structure, allowing new operations to be added without modifying existing classes
        // Places the new behaviour into separate class called visitor, instead of trying to integrate it into existing classes
    }

}