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
        // No, because this method exists in the class itself
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, because b is of type B which is a friend as it is an attribute of A
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, because this class D is passed in as a parameter
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! Yes, because C is not a friend of A (it doesn't satisfy the criteria)
        a.greet();
    }
}
