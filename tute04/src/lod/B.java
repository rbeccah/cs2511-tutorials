package lod;

public class B {
    // * A is in the attributes of B
    // * B is a friend to A
    
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
