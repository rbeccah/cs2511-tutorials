package dogs;

// ? What is the purpose of using an interface in this code? 
// Dog interface is used to enforce classes that implement this Dog interface to always implement bark functionality

// ? What are some downsides of the use of the interface here? 
// Repeated code between dog subtypes (i.e. colour)

// ? Is an interface the best use here? 
// NO, abstract class

public abstract class Dog {
    private String colour;

    public Dog(String colour) {
        this.colour = colour;
    }

    public abstract void bark();
    
}