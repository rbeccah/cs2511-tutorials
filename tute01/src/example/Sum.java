package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // ? Scanner, scanner - 
        // Scanner - type of the variable which is class Scanner, scanner - variable name
        // RHS - creating an instance of the class Scanner
        // new Scanner() calls the constructor of the Scanner so we can build an instance of Scanner
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {

        // }

        // for-each loop
        for (String number : numbers) {
            // parseInt is a static function
            int val = Integer.parseInt(number);
            sum += val;
        }

        System.out.println("Sum: " + sum);

        // ? Why do we need to close the scanner
        // Reduce the performance of the overall program
        scanner.close();
    }
}
