package example;

public class Shouter {
    // Attributes (data)
    // access modifiers (private, protected, default, public)
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - attribute of the class
        // message - input to this constructor
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String new_message) {
        this.message = new_message;
        // message = new_message;
    }

    private int shoutLength() {
        return message.length();
    }

    // Method
    public void shout() {
        System.out.println(message.toUpperCase() + "!" + shoutLength());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();

        Shouter shouter2 = new Shouter("i am another shouter");
        shouter2.shout();
        shouter2.setMessage("change message of shouter2");
        shouter2.shout();
        shouter.shout();
    }
}
