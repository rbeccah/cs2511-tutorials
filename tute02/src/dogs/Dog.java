package dogs;

// ? What is the purpose of using an interface in this code? 

// ? What are some downsides of the use of the interface here? 
// Can have repeated code between dog subtypes

// ? Is an interface the best use here? 
// No

public abstract class Dog {
    private String colour;

    public Dog(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract void bark();
    
}