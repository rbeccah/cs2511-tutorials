package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 * 
 */
/*
* Here, a generic class is created which can operate on objects of any type. 
*/

// ? What is E
// E is a generic type which will be replaced by a concrete type when an instance of Stack is created

// ? What is an Iterable interface?
// A collection of objects which can be iterated over to be able to use the enhanced for loop (for-each loop)

// ? Why does it have E as well? 
// Iterable interface has .iterator() method
// We have E as well to ensure that the iterator() method will also return the same type E

// ? What methods does it force us to implement?
// Since Stack is implementing Iterbale, it forces us to implement the .itertor() method

public class Stack<E> implements Iterable<E> {
    private List<E> elements = new ArrayList<E>();
    
    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        elements.add(element);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return elements.get(elements.size() - 1);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        E top = peek();
        elements.remove(elements.size() - 1);
        return top;
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        // ! What is not desirable about this implementation? 
        // Breaking encapsulation because Java will return Stack's own private attribute elements
        // This is not good because the user can manipulate list in ways that would violate the principles of Stack
        // return (ArrayList<E>) elements;

        // Instead create a new ArrayList which is a copy of the elements
        ArrayList<E> copy = new ArrayList<E>(elements);
        return copy;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = toArrayList();
        // Because we implement as ArrayList, if we were to iterate through it would be from bottom to top
        // Instead we can reverse it to behave (to iterate) like a stack
        Collections.reverse(copy);
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return elements.size();
    }

    // ? What does <? extends Integer> mean?
    // This method accepts parameters that are a Stack of elements of any type which is either Integer or a subclass of Integer
    // MyInteger extennds Integer

    // ? Why don't we just do Stack<Integer>? 
    // Then, it would only accept Stack of elements that are exactly of type Integer

    // ? What is the difference between `?` and E? 
    // For ?, it cannot be referred to as a concrete type, whereas E can
    // E first = copy.get(0);
    // vs. ? first = copy.get(0) <- this will not work 

    public static Integer sumStack(Stack<? extends Integer> stack) {
        // Let's use the iterator
        int total = 0;
        Iterator<? extends Integer> iter = stack.iterator();
        while(iter.hasNext()) {
            total += iter.next();
        }
        return total;
    }

    /**
     * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[]"
     * "[1, 2, 3]"
     * @param stack
     */
    // ? -> unbounded wildcard
    public static void prettyPrint(Stack<?> stack) {
        System.out.print("[");
        Iterator<?> iter = stack.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
        

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);

        Stack<Integer> stack2 = new Stack<Integer>();
        stack2.push(2);
        stack2.push(1);
        stack2.push(3);
        System.out.println(Stack.sumStack(stack2));

        // For invalid type which is a stack of elements which is not an Integer or subclass, the compiler will already throw an error
        // System.out.println(Stack.sumStack(stack));
    }

}