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
        // No
        helloWorld();

        // ? Does this violate Law of Demeter
        // Because B is an attribute of C
        // No
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, becuase it passed as the parameter to this function
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! Yes, violate
        a.greet();

        // Method chaining
        b.getA().greet();
    }
}
