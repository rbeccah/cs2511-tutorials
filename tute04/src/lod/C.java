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
        // No, because we can access methods inside our own class
        helloWorld();

        // ? Does this violate Law of Demeter
        // No, B is an attribute to C so is a friend as well
        b.greet();
    }

    public void showData(D d) {
        // ? Does this violate Law of Demeter
        // No, D is a friend because it is passed in as a parameter
        d.greet();

        A a = b.getA();
        // A a = new A();
        
        // ? Does this violate Law of Demeter
        // ! This does violate LoD, it doesnt satisfy any of our crtieria as a friend
        a.greet();

    }
}
