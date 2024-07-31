// * Concrete elements
// Must implement the acceptance method. 
// The method for accept() should redirect the call to the proper visitor's method corresponding to the correct element class
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
        // Check the user is validated
        if (visitor.checkValidated()) {
            visitor.visit(this);
        } else {
            System.out.println("User is not validated to visit Computer");
        }
    }
    

}