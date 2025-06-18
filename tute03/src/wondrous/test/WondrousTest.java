package wondrous.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import wondrous.Wondrous;

public class WondrousTest {
    @Test
    public void testBasic() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));
        
        assertEquals(expected, w.wondrous(3));
    }

    @Test
    public void testOne() {
        Wondrous w = new Wondrous();

        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, w.wondrous(1));
    }

    @Test
    public void testInvalid() {
        Wondrous w = new Wondrous();
        assertThrows(IllegalArgumentException.class, () -> {
            w.wondrous(0);
        });
    }
}