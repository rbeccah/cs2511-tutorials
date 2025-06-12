package dogs;

// ? What is the purpose of using an interface in this code? 
// Dog interface is used to enforce that subtypes always implement bark functionality

// ? What are some downsides of the use of the interface here? 
// Can introduce repetition

// ? Is an interface the best use here? 
// It is better to use an abstract class

public abstract class Dog {
    private String colour;

    public String getColour() {
        return colour;
    }

    public abstract void bark();
    
}