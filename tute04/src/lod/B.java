package lod;

public class B {
    
    // * HAS-A (diamond)
    // A is a friend to B
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
