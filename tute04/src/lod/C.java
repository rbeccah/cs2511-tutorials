package lod;

public class C {
    // B is a friend to C
    private B b;

    public C(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void helloWorld() {
        System.out.println("Hello world");
    }

    public void greet() {
        // ? Does this violate Law of Demeter
        // No, because the method exists in the class itself
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, becase B is in the attributes of C
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // d is a friend because it is passed in as the parameters
        d.greet();

        // b.getA().greet();
        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! No, because it doesn't satisfy any of the criteria
        a.greet();
    }
}
