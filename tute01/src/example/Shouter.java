package example;

public class Shouter {
    // Attributes
    // private - access modifier
    // private, public, protected, default
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - the class' attribute message
        // message - the input to the constructor message
        this.message = message;
    }

    // Methods
    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase() + "!");
    }
    
    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();

        shouter.setMessage("changing to a new message");
        shouter.shout();

        Shouter shouter2 = new Shouter("this is another shouter");
        shouter2.shout();
        System.out.println(shouter.message);
    }
}
