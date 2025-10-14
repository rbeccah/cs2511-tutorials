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
        strings.forEach(s -> {
            System.out.println(s);
        });

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        List<Integer> ints1 = strings2
            .stream()   // converts strings2 into a stream object
            .map(s -> Integer.parseInt(s))  // map applies a function to each element
            .collect(Collectors.toList());

        List<Integer> ints3 = strings2
            .stream()   // converts strings2 into a stream object
            .map(Integer::parseInt)  // method reference/scope operator
            .collect(Collectors.toList());
        System.out.println(ints3);


         //* Demonstrate filter and reduce */
        // From a list of integers, take only the even numbers and find the sum
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        int even = numbers
            .stream()
            .filter(x -> x % 2 == 0)
            .reduce(0, (res, num) -> res + num);

        // reduce in for loop
        int identity = 0;
        int res = identity;
        List<Integer> stream = Arrays.asList(2, 4, 2); // Imagine this is a stream
        for (int num : stream) {
            res = res + num;
        }
    }


}