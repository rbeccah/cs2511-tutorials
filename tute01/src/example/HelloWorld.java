package example;

/**
 * Prints "Hello World" to the console.
 *
 * @author Robert Clifton-Everest
 *
 */

// All things that you code in Java are inside classes
public class HelloWorld {

    // Run our java program
    // Main function
    public static void main(String[] args) {
        System.out.println("hello world");

        // Printing without a new line
        System.out.print("hello world");

        // Printing with variables
        int world_number = 5;
        System.out.println("hello world " + world_number);
        System.out.printf("hello world %s\n", world_number);

        Shouter shouter3 = new Shouter("shouter in another class");
        shouter3.shout();
    }

}
