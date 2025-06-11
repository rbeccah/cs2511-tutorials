package dogs;

// ? What is the purpose of using an interface in this code? 
// Dog interface is used to enforce that classes that implement Dog have to have this bark functionality

// ? What are some downsides of the use of the interface here? 
// Repeated code between dog subtypes (i.e. related to colour)

// ? Should this really be an interface? 
// In this case no, it makes more sense to be an abstract class

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