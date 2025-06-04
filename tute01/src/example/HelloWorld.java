package example;

/**
 * Prints "Hello World" to the console.
 *
 * @author Robert Clifton-Everest
 *
 */
public class HelloWorld {

    // Main function
    public static void main(String[] args) {
        System.out.println("hello world");

        // Print with variables
        int world_number = 5;
        System.out.println("hello world " + world_number);
        System.out.printf("hello world %s\n", world_number);

        Shouter shouter = new Shouter("another shouter in another class");
        shouter.shout();
    }

}
