package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        // for (String string : strings) {
        //     System.out.println(string);
        // }
        strings.forEach(s -> System.out.println(s));

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        List<Integer> ints = strings2
            .stream()       // Converts a list of Strings into a stream of Strings
            .map(s -> Integer.parseInt(s))      // Converts each String into an Integer
            .collect(Collectors.toList());
        System.out.println(ints);

        //* Demonstrating filter and reduce */
        // * Take the sum of only the even numbers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        int sumEven = numbers
            .stream()
            .filter(x -> x % 2 == 0)    // Takes in a predicate (boolean function)
            .reduce(0, (res, i) -> res + i);
            // res -> current accumulated value in the stream
            // i -> current value in the stream

        // Reduce as for loop
        int identity = 0;
        List<Integer> stream = Arrays.asList(2, 4, 2);
        for (int num : stream) {
            identity = identity + num;
        }
    }


}