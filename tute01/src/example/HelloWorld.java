package example;

/**
 * Prints "Hello World" to the console.
 *
 * @author Robert Clifton-Everest
 *
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Printing with variables
        int world_number = 3;
        System.out.println("Hello World" + world_number);

        System.out.printf("Hello World %d\n", world_number);

        Shouter shouter3 = new Shouter("I am in a different class");
    }

}
