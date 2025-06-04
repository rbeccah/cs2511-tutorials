package example;

public class Shouter {
    // Attributes
    // private - access modifiers
    private String message;

    // Constructor
    public Shouter(String message) {
        // this.message - this class' message attribute
        // message - input from the constructor
        this.message = message;
        // message = new_message;
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

    private void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("i love comp2511");
        shouter.shout();
        shouter.setMessage("this is a new message");
        shouter.shout();
        shouter.print();

        Shouter shouter2 = new Shouter("i am another instance of shouter");
        shouter2.shout();
    }
}
