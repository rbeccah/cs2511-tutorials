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

// ? What is E
// E is a generic type which will be replaced by a concrete type when an instance of Stack is created at runtime

// ? What is an Iterable interface?
// A collection of objects which can be iterated over (e.g. for-each loops)
// By implement Iterable, Stack class can use for-each

// ? Why does Iterable have E as well? 
// Ensure that the iterator() method in the interface Iterable will also return the same type E

// ? What methods does it force us to implement?
// Since Stack is implementing Iterable, it forces us to implement .iterator() method

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
        // ! What is not desirable about this implementation
        // Breaking encapsulation because Java will return the actual reference that Stack has to its attribute of elements
        // Users can manipulate the list in ways that violate the principles of stack
        // return (ArrayList<E>) elements;

        // Instead we create a new ArrayList which is a copy of the elements so users don't modify the original list
        ArrayList<E> copy = new ArrayList<E>(elements);
        return copy;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    @Override
    public Iterator<E> iterator() {
        List<E> copy = toArrayList();
        // Because we implemented using an ArrayList, we must reverse the array list to behave like a stack
        Collections.reverse(copy);

        // Copy is a list which also implements the iterator() 
        // When iterator() is called, it returns the Iterator inteface which provides the methods to traverse
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return elements.size();
    }

    // ? What does <? extends Integer> mean?
    // This is a method that accepts paramters that are a Stack of elements of any type that is either Integer or a subclass of Integer

    // ? Why don't we just do Stack<Integer>?
    // Then, we won't be able to take in subclasses of Integer
    // MyInteger extends Integer

    // ? What is the difference between `?` and E?
    // For ?, it cannot be specficially referred to as a concrete type
    // E first = copy.get(0)
    //` ? first = copy.get(0) <- does not work

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int total = 0;
        // for (Integer element : stack) {
        //     total += element;
        // }
        // return total;

        // Using Iterator methods
        Iterator<? extends Integer> iter = stack.iterator();
        while (iter.hasNext()) {
            total += iter.next();
        }
        return total;
    }

    /**
     * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[]"
     * "[1, 2, 3]"
     * @param stack
     */
    // <?> is unbounded wildcard which means it can take any type, not necessary E
    public static void prettyPrint(Stack<?> stack) {
        System.out.print("[");
        Iterator<?> iter = stack.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
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
        stack2.push(3);
        stack2.push(1);
        System.out.println(Stack.sumStack(stack2));

        // System.out.println(Stack.sumStack(stack));
    }

}