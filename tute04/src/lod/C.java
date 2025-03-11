package lod;

public class C {
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
        helloWorld();

        // ? Does this violate Law of Demeter
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        a.greet();
    }
}
