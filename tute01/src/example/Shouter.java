package example;

public class Shouter {
    // Attributes
    private String message;

    // Constructor
    public Shouter(String message) {
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

    // Method
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

        Shouter shouter2 = new Shouter("i am another shouter");
        shouter2.shout();
    }
}
