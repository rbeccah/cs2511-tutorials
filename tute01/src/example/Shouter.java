package example;

public class Shouter {
    // Attributes
    // access modifiers
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - the message attribute to the class
        // message - refers to the message passed in as the parameter
        this.message = message;
        // setMessage(message);
    }

    // Getters
    public String getMessage() {
        return message;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    // Method
    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();

        shouter.setMessage("comp2511 change message");
        shouter.shout();

        Shouter shouter2 = new Shouter("i am nother shouter");
        shouter2.shout();
        shouter.shout();
    }
}
