package lod;

public class C {
    // * Class C has an attribute of type B. So B is a friend to C. 
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
        // No, because b is of type B which is an attribute to this class, so B is a friend, so we can access b.greet()
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // d is an input parameter to this function
        // D is a friend to this class, so this does not violate LoD
        d.greet();

        A a = b.getA();

        // ? Does this violate Law of Demeter
        // ! this violates LoD, because it does not satisfy any of the 4 criteria to be a friend
        a.greet();
        b.getA().greet();
    }
}
