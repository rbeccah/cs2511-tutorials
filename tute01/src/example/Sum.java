package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner - class / type of the variable
        // scanner - variable name
        // Calling the constructor of Scanner
        // Creating an instance of class Scanner
        // classes vs instances
        Scanner scanner = new Scanner(System.in);

        // "1 2 3 4 5"
        // ["1", "2", "3", ...]
        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        // for number in numbers (Python)
        for(String number : numbers) {
            // parseInt() is static
            int val = Integer.parseInt(number);
            sum += val;
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
