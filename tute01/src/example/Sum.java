package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner - the class type of the variable
        // scanner - variable name
        // RHS - calling the constructor, and creating an instance 
        Scanner scanner = new Scanner(System.in);

        // String read in from stdin
        String[] numbers = scanner.nextLine().split(" ");
        scanner.close();

        int sum = 0;
        // for (String number : numbers) {
        //     // parseInt() is a static function
        //     int val = Integer.parseInt(number);
        //     sum += val;
        // }

        System.out.println("Sum: " + sum);

        // for (int i = 0; i < numbers.length; i++) {

        // }

        // ? Why do they want us to close the scanner? 
        // Reduces the performance of the overall program
        // scanner.close();


    }
}
