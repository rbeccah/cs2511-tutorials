package lod;

public class B {
    // * Class A is in the attributes of B, so A is a friend to B
    // The methods in A can be accessed in B
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
