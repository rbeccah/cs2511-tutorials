package lod;

public class C {
    // * C "HAS-A" B, and so B is a friend to C
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
        // This does not violate, because this is a method from the class itself
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, because b is a attribute to C, so is a friend
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, because D is passed in as a parameter, so is a friend
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! Yes, this does not satisfy any of the criteria to be a friend
        a.greet();
    }
}
