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
        // * One-liner
        strings.forEach(s -> System.out.println(s));

        // * With curly braces
        strings.forEach(string -> {
            System.out.println(string);
        });

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
        List<Integer> ints1 = strings
            .stream()       // converts into the Stream object 
            .map(s -> Integer.parseInt(s))  // applies a map function to each element
            .collect(Collectors.toList());

        List<Integer> ints2 = strings
            .stream()  
            .map(Integer::parseInt)  // special type of lambda function called method reference/scope operator
            .collect(Collectors.toList());

        //* Demonstrate filter and reduce */
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        int even = numbers
            .stream()
            .filter(x -> x % 2 == 0)    
            // takes predicate (function which returns boolean) and returns what is True
            .reduce(0, (res, num) -> res + num); 
            // start at 0, res -> current accumulated value, i -> current value in stream
        System.out.println(even);

        // reduce in for loop
        int identity = 0;
        int res = identity;
        List<Integer> stream = Arrays.asList(2, 4, 2); // Imagine this is a stream :DD
        for (int num : stream) {
            res = res + num;
        }
    }


}