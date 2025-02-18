package example;

public class Shouter {
    // Attributes
    // private - access modifier
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message -> class' attribute called message
        // message -> input to the constructor
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String newMessage) {
        message = newMessage;
    }

    // Method to shout
    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    private int shoutLength() {
        return message.length();
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();
        System.out.println(shouter.getMessage());

        shouter.setMessage("this is a new message");
        shouter.shout();

        Shouter shouter2 = new Shouter("this is a 2nd shouter");
        shouter2.shout();
    }
}
