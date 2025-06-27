package lod;

public class B {
    
    // * Class B has A in its attributes, A is a friend to B
    // I can access methods of A in B
    private A a;

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void greet() {
        System.out.println("Hi! I am from class B.");
    }
}
