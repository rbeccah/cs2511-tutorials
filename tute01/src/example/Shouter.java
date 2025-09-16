package example;

public class Shouter {
    // Attributes
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - the attribute of the class
        // message - the input for the constructor
        this.message = message;
    }

    // Methods
    // Getters
    public String getMessage() {
        return message;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase() + "!" + shoutLength());
    }

    private int shoutLength() {
        return message.length();
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();

        shouter.setMessage("comp2511 is the best course");
        shouter.shout();

        Shouter shouter2 = new Shouter("i am another shouter");
        shouter2.shout();
        shouter.shout();
    }

}
