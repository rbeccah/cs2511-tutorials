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
        strings.forEach(s -> System.out.println(s));

        // * With curly braces
        strings.forEach(s -> {
            // Multiple statements in this curly brackets
            System.out.println(s);
        });

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);
        List<Integer> ints1 = strings2
            .stream()   // converts the List into a stream
            .map(s -> Integer.parseInt(s))
            .collect(Collectors.toList());  // collects the result of the stream into a new list

        List<Integer> ints2 = strings2
            .stream()   // converts the List into a stream
            .map(Integer::parseInt)     // scope operator / method reference
            .collect(Collectors.toList());  // collects the result of the stream into a new list

         //* Demonstrate filter and reduce */
        // From a list of integers, take only the even numbers and find the sum
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        int even = numbers
            .stream()
            .filter(x -> x % 2 == 0)    // filter by even number
            .reduce(0, (ans, i) -> ans + i);
        
        // reduce as normal for loop
        int identity = 0;
        List<Integer> stream = Arrays.asList(2, 4, 2); // pretend this is a stream
        for (int num : stream) {
            identity = identity + num;
        }

    }


}