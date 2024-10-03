package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        for (String string : strings) {
            System.out.println(string);
        }
        // * one-liner
        strings.forEach(string -> System.out.println(string));

        // * curly braces
        strings.forEach(string -> {
            // Add more lines
            System.out.println(string);
        });

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);
        List<Integer> ints1 = strings2
            .stream()   // Convert to a stream
            .map(s -> Integer.parseInt(s))      // map applies a function to each element
            .collect(Collectors.toList());

            List<Integer> ints2 = strings2
            .stream()   // Convert to a stream
            .map(Integer::parseInt)      // method reference
            .collect(Collectors.toList());

        // * Demontrates filter, reduce
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        int sum = numbers
            .stream()
            .filter(x -> x % 2 == 0)
            .reduce(0, (ans, i) -> ans + i);

        // Reduce as a loop
        int identity = 0;
        List<Integer> stream = Arrays.asList(2, 4, 2); //Pretend its a stream
        for (int num : stream) {
            identity = identity + num;
        }

    }


}