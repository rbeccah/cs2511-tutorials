package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner - type / class
        // scanner - variable name
        // RHS - calling the constructor of Scanner
        // Constructor builds an instance of the class Scanner
        // Instance vs class
        Scanner scanner = new Scanner(System.in);

        // "1 2 3 4 5"
        // ["1", "2", "3", ...]
        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        // for number in numbers (Python)
        for(String number : numbers) {
            // parseInt() is a static function
            int val = Integer.parseInt(number);
            sum += val;
        }
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
