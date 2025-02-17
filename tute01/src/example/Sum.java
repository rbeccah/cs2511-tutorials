package example;

import java.util.Scanner;

public class Sum {
    // Main function
    // int variable_name
    public static void main(String[] args) {
        // Instantiating the class of Scanner
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        for (String number : numbers) {
            // Integer class is a wrapper for the primitive data type int
            int val = Integer.parseInt(number);
            sum += val;
        }
        System.out.println("Sum: " + sum);

        scanner.close();

        Shouter shouter = new Shouter("hello");
    }
}
