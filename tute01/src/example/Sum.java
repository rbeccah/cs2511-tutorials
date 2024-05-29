package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // nextLine() - gets a line from stdin
        String line = scanner.nextLine();
        // ["1", "45", "13"]
        String[] numbers = line.split(" ");
        scanner.close();

        int sum = 0;    // primitive type 
        for (String number : numbers) {
            int val = Integer.parseInt(number);
            sum += val;
        }
        System.out.println("Sum: " + sum);
    }
}
