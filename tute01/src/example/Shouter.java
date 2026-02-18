package example;

public class Shouter {
    // Attribute
    // abstraction
    private String message;

    // private int even_number;

    // Constructor
    public Shouter(String message) {
        // ? this.message - referring to the class attribute message
        // ? message - parameter
        this.message = message;

        // setMessage(message);
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    private int shoutLength() {
        return message.length();
    }

    // Method
    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("comp2511 is the best course");
        shouter.shout();

        shouter.setMessage("change to a new message");
        shouter.shout();

        Shouter shouter2 = new Shouter("another instance of Shouter");
        shouter2.shout();
    }
}
