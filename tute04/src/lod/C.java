package lod;

public class C {
    // HAS-A
    // B is an attribute to C, therefore B is a friend to C
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
        // No, because this is a method that exists in the class itself
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, because b is of type B which is a friend to C
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // D is passed in as a parameter, therefore D is a friend
        // NO 
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // YES, because A is not a friend to C
        a.greet();

        // method chaining
        b.getA().greet();
    }
}
