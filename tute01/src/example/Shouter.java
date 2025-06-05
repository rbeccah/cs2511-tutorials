package example;

public class Shouter {
    // Attribute
    // access modifier - controls the access of certain methods and attributes
    // security, abstraction
    // public, private, protected, default
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - this class' attribute called message
        // message - input from the constructor
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    // Methods
    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();
        shouter.setMessage("changing to a new message");
        shouter.shout();

        Shouter shouter2 = new Shouter("another shouter");
        shouter2.shout();
    }
}
