package lod;

public class C {
    // * Class C holds instance of B in its attributes, so B is a friend to C
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
        // No, because we can still access its own classes' methods
        helloWorld();

        // ? Does this violate Law of Demeter
        // B is a friend because it is an attribute of C
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, D is passed in as a parameter, so D is a friend
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! Yes, as it doesn't satisfy the 4 criteria
        a.greet();
    }
}
