package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner - variable type 
        // scanner - variable name
        // new - calling the constructor of Scanner to create a new instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        // for-each loop
        for (String number : numbers) {
            // parseInt() is a static function
            int val = Integer.parseInt(number);
            sum += val;
        }

        System.out.println("Sum: " + sum);

        // for (int i = 0; i < numbers.length; i++) {

        // }
        scanner.close();
    }
}
