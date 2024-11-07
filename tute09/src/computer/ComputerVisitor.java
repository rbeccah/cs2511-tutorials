package computer;

// * Concrete Visitor class
// Declares a set of visiting methods that can take concrete elements as arguments
// Implements several versions of logging messages
public class ComputerVisitor {
    private boolean validated;

    // Visit method for Computer
    public void visit(Computer computer) {
        System.out.println("Looking at computer " + computer.toString() + " with memory " + computer.getMemory() + " GB.");
    }

    // Visit method for Keyboard
    public void visit(Keyboard keyboard) {
        System.out.println("Looking at keyboard " + keyboard.toString() + " which has " + keyboard.getNumKeys() + " keys.");
    }

    // Visit method for Mouse
    public void visit(Mouse mouse) {
        System.out.println("Looking at mouse " + mouse.toString() + ".");
    }

    public boolean checkValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();

        computer.accept(visitor);
        keyboard.accept(visitor);

    }

}