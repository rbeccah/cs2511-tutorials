package example;

public class Shouter {
    // Attributes
    // ? What is this private thing doing here? 
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
    public void setMessage(String newMessage) {
        message = newMessage;
    }

    // Methods
    private void shout() {
        System.out.println(message.toUpperCase() + "!");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i like comp2511");
        shouter.shout();
        System.out.println(shouter.getMessage());

        shouter.setMessage("i love comp2511");
        shouter.shout();

        Shouter shouter2 = new Shouter("i am a second shouter");
        shouter2.shout();
        shouter.shout();
    }
}
