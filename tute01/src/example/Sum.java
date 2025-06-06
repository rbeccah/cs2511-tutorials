package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner - variable / type
        // scanner - variable name
        // RHS - calling the constructor for Scanner
        // The constructor creates an instance of the class Scanner
        // class vs. instance
        Scanner scanner = new Scanner(System.in);

        // "1 2 3 4 5"
        // ["1", "2", "3", ...]
        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        // for-each loop
        // Python (for number in numbers)
        // for(int i = 0; i < numbers.length; i++) {

        // }

        for(String number : numbers) {
            // parseInt() is a static function so we can call it from the Integer class directly
            int val = Integer.parseInt(number);
            sum += val;
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
