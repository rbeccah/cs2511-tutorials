package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {

    private final int MY_MAGIC_NUMBER = 42;

    public List<Integer> wondrous(int start) {

        if (start == 1) {
            return new ArrayList<>();
        } else if (start < 1) {
            throw new IllegalArgumentException("wondrous must have start >= 1");
        }
        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        while (current != 1) {
            sequence.add(current);
            test();
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }
        sequence.add(current);

        return sequence;
    }

    public void test() {
        int var = 0;
        System.out.println(var);
    }

}