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
        // No, because it is a method of the class itself
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, because B is an attribute of this class
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, because we can call methods from things passed in from the parameter
        d.greet();

        A a = b.getA();

        // Method chaining
        // b.getA().greet();

        // ? Does this violate Law of Demeter
        // ! Yes, because it does not satisfy any of the criteria
        a.greet();
    }
}
