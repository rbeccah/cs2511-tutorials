package example;

import java.util.Scanner;

// Our own custom class
public class Sum {
    public static void main(String[] args) {
        // ? What is the difference between Scanner and scanner
        // Instances are different to the class itself
        // we created a new instance of the class scanner
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;    // float, double
        for(String number : numbers) {
            int val = Integer.parseInt(number);
            sum += val;
        }

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
