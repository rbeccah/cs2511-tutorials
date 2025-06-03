package example;

public class Shouter {
    // Attributes
    // ? What is this private? 
    // Access modifier
    private String message;

    // Constructor
    public Shouter(String message) {
        // ? this.message - Shouter's message attribute
        // ? message - the input to the constructor
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return this.message;
    }

    // Setter
    public void setMessage(String new_message) {
        this.message = new_message;
    }

    // Method
    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();

        shouter.setMessage("hello this is our first tutorial");
        shouter.shout();

        Shouter shouter2 = new Shouter("i am another shouter");
        shouter2.shout();
    }
}
