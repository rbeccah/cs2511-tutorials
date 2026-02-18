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

        System.out.print("hello world");

        // Printing with variables
        int world_number = 0;
        System.out.println("hello world " + world_number);
        System.out.printf("hello world %d\n", world_number);

        Shouter shouter = new Shouter("shouter from another class");
        // shouter.messageLength();
    }

}