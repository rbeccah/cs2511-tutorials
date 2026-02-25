package dogs;

import java.util.ArrayList;
import java.util.List;

public class Chihuahua extends Dog {

    public Chihuahua(String colour) {
        super(colour);
    }

    @Override
    public void bark() {
        System.out.println("arf arf!");
    }

    public void beCarried() {
        System.out.println("Carrying the chihuahua in a little bag!");
    }
    
    public static void main(String[] args) {
        List<Object> animals = new ArrayList<>();
        animals.add(new Chihuahua("brown"));
        animals.add(new Greyhound("grey"));

        for (Object o : animals) {
            if (o instanceof Dog) {
                ((Dog)o).bark();
            }
        }
    }


}
