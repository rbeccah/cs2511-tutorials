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
// E is a generic type which will be replaced by a concrete type when instance of Stack is created

// ? What is an Iterable interface?
// A collection of objects which can be iterated over
// for (String value : stringList) {
//     System.out.println(value);
// }
// By implementing Iterable, Stack class can be used in for-each loops

// ? Why does Iterable have E as well? 
// So that the Iterable can take in any type
// Also we can pass in the generic type of E to Iterator interface

// ? What methods does it force us to implement?
// Since Stack is implementing Iterable, it forces us to implement the .iterator() method

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
        // Breaking encapsulation because Java will return Stack's own private elements
        // User can manipulate the list itself that violates principles of Stack
        // return (ArrayList<E>) elements;

        // Instead we can create a new ArrayList which is a copy
        return new ArrayList<E>(elements);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = toArrayList();
        // Now that we reverse, we can iterate over it like it was a stack
        Collections.reverse(copy);

        // When iterator() is called, it returns the Iterator interface which provides methods to traverse our list/stack
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return elements.size();
    }

    // ? What does <? extends Integer> mean?
    // this ? is called a wildcard
    // This method accepts parameters that are a Stack of elements of any type which is T or subclass of T

    // ? Why don't we just do Stack<Integer>?
    // For flexibility
    // In the future we can make a class called MyInteger extends Integer
    // Stack<MyInteger> can also be accepted by this function

    // ? What is the difference between `?` and E?
    // For ?, it cannot be referred to explicitly as a type
    // For e.g. ? first = copy.get(0);
    // E first = copy.get(0);

    public static Integer sumStack(Stack<? extends Integer> stack) {
        // int total = 0;
        // for (Integer element : stack) {
        //     total += element;
        // }
        // return total;

        // Using iterator methods
        int total = 0;
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
    }

}