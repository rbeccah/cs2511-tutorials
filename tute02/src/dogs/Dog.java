package dogs;

// ? What is the purpose of using an interface in this code? 
// Dog interface is used to enforce that subtypes of dog always implement the bark functionality

// ? What are some downsides of the use of the interface here? 
// There is repeated code for the colour aspect of each dog subclass

// ? Is an interface the best use here? 
// NO 

public abstract class Dog {
    private String colour;

    public Dog(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public abstract void bark();
    
}