package lod;

public class B {
    
    // * B "HAS-A" A
    // A is an attribute of B, so A is a friend to B
    // We can access the methods in A
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
