package example;

/**
 * Prints "Hello World" to the console.
 *
 * @author Robert Clifton-Everest
 *
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world");

        // Printing without a new line
        System.out.print("hello world");

        // Print with variables
        int world_number = 5;   // primitive type, char, double, float
        System.out.println("world number: " + world_number);
        System.out.printf("hello world %s\n", world_number);

        Shouter shouter = new Shouter("shouter from anothter class");
        shouter.shout();
        // shouter.shoutLength();
    }

}
