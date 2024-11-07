package computer;

// * Concrete elements
// Must implement the accept method. This method redirects the call to the visitor interface and the correct visitor method depending on the concrete class
public class Computer implements ComputerComponent {

    private String name;
    private int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        if (visitor.getValidated()) {
            visitor.visit(this);
        } else {
            System.out.println("Not validated!");
        }
    }
    

}