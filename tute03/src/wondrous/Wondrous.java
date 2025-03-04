package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {

    private final int MY_MAGIC_NUMBER = 42;

    public List<Integer> wondrous(int start) {
        if (start == 1) {
            return new ArrayList<>();
        }
        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        while (current != 1) {
            sequence.add(current);
            usingStackInDebugger();
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
            usingStackInDebugger();
        }

        sequence.add(1);

        return sequence;
    }

    public void usingStackInDebugger() {
        int var = 10;
        System.out.println("In stack debugger function");
    }

}