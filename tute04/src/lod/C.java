package lod;

public class C {
    // * Class B is in C's attributes
    // * B is a friend of C
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
        // No, because we are calling one of the class' own methods
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, because B is a friend of C (B is an attribute to C)
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, because we can access methods of classes passed in as a parameter
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! Yes, because A is not a friend of C (does not meet the requirements of LOD)
        a.greet();
    }
}
