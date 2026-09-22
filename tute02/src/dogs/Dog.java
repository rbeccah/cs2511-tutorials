package dogs;

// ? What is the purpose of using an interface in this code? 
// All dogs should be able to bark as their functionality

// ? What are some downsides of the use of the interface here? 
// Repetition of colour

// ? Is an interface the best use here? 

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