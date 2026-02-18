package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // LHS - Scanner, scanner 
        // Scanner - type / object type of the variable 
        // scanner - variable name
        // RHS - new -> calling the constructor of the class to initialise an instance of Scanner 
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        scanner.close();

        int sum = 0;

        // for ... in ... (Python)
        // for each loop
        for (String number : numbers) {
            // new Integer()
            // static methods, you do not need to create the instance in order to use static methods
            int val = Integer.parseInt(number);
            sum += val;
        }

        System.out.println("Sum : " + sum);
    }
}
