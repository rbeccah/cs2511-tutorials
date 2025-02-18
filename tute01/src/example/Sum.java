package example;

import java.util.Scanner;

public class Sum {
    // Main function
    public static void main(String[] args) {
        // Instance of the class Scanner
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        int sum = 0;
        for (String number : numbers) {
            int val = Integer.parseInt(number);
            sum += val;
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}
