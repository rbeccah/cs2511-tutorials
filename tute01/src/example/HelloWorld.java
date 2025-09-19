package example;

/**
 * Prints "Hello World" to the console.
 *
 */
public class HelloWorld {

    // Main function
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.print("hello world\n");

        int world_number = 5;
        System.out.println("hello world " + world_number);
        System.out.printf("hello world %d\n", world_number);

        Shouter shouter3 = new Shouter("shouter from another class");
        // System.out.println(shouter3.message);
    }

}
