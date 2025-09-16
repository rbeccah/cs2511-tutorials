package example;

/**
 * Prints "Hello World" to the console.
 *
 */

// All code in Java exists inside a class
public class HelloWorld {

    // Main function
    public static void main(String[] args) {
        System.out.println("hello world");

        // Print without a new line
        System.out.print("hello world 2\n");

        // Printing with variables
        int world_number = 5;
        System.out.println("hello world " + world_number);
        System.out.printf("hello world %s\n", world_number);

        Shouter shouter3 = new Shouter("shouter from another class");
        shouter3.shout();
        // shouter3.shoutLength();
    }

}
