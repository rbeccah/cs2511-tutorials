package dogs;

// ? What is the purpose of using an interface in this code? 

// ? What are some downsides of the use of the interface here? 
// Interface - had repetition of colour

abstract public class Dog {
    private String colour;

    public Dog(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public abstract void bark();
    
}