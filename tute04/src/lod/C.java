package lod;

public class C {
    // * Type B in the attributes of C
    // * B is a friend to C
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
        // No, because we can access the class' methods itself
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, because B is a friend to C (B is the attributes to C)
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // Type D is passed in as a parameter to this function
        // D is a friend, so we can access methods in D
        // No 
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! Yes, A is not a friend to C because it doesn't satisfy any of the requirments to access the method
        a.greet();
    }
}
