package computer;

// * Concrete element
// Must implement the accept() method. This method redirects the call to the proper visitor method corresponding to the concrete element class
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
        if (visitor.checkValidated()) {
            visitor.visit(this);
        } else {
            System.out.println("User is not validated to visit Computer");
        }
    }
    

}