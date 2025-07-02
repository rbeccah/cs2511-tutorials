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

        // * Curly braces
        strings.forEach(s -> {
            System.out.println(s);
        });

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
        List<Integer> ints1 = strings2
            .stream()
            .map(s -> Integer.parseInt(s))
            .collect(Collectors.toList());

        List<Integer> ints2 = strings2
            .stream()
            .map(Integer::parseInt)     // method reference / scope operator (special type of lambda function)
            .collect(Collectors.toList());

         //* Demonstrate filter and reduce */
        // From a list of integers, take only the even numbers and find the sum
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        int even = numbers
            .stream()
            .filter(x -> x % 2 == 0)    // filter takes in a predicate function (function that returns a boolean), filters through everything that is true
            .reduce(0, (res, num) -> res + num);

        int identity = 0;
        int res = identity;
        List<Integer> stream = Arrays.asList(2, 4, 2);
        for(int num : stream) {
            res = res + num;
        }

    }


}