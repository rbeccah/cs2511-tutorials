package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner - class / type of the variable
        // scanner - variable name
        // We are creating an instance of Scanner
        // instance vs. class
        // new Scanner(System.in) - calling the constructor 
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;    // int is a primitive (e.g. float, double)
        for(String number : numbers) {
            // static methods
            int val = Integer.parseInt(number);
            sum += val;
        }
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
