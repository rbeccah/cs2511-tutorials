package example;

public class Shouter {
    // Attributes / fields
    // access modifier - controls what classes can access this attribute
    // ? Why can't we access message in other classes?
    // Abstraction
    // Security
    // private, public, protected, default
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - this class' attribute message
        // message - input parameter of the constructor
        this.message = message;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    // Setters (update the value in message)
    public void setMessage(String message) {
        this.message = message;
    }

    // Methods
    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    private void printMessage() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();
        shouter.setMessage("this is a new message");
        shouter.shout();

        Shouter shouter2 = new Shouter("this is a another shouter");
        shouter2.shout();
    }
}
