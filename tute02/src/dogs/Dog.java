package dogs;

// ? What is the purpose of using an interface in this code? 

// ? What are some downsides of the use of the interface here? 

// ? Is an interface the best use here? 
// No, abstract class because Dog is a Greyhound

public abstract class Dog {
    private String colour;

    public Dog(String colour) {
        this.colour = colour;
    }

    public abstract void bark();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
}