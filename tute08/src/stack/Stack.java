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
// E is a generic type, so that when a user instantiates the Stack, it is able to be replaced with any type

// ? What is an Iterable interface?
// for (String value : strings) {

// ? Why does Iterable have E as well? 
// Ensures that the iterator() method in the Iterable interfce will also return the same type E

// ? What methods does it force us to implement?
// Since Stack is implementing Iterable, we have to implement the .iterator() method

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
        // Here, we would be returning the actual reference 
        // Breaking encapsulation, because Java will return the Stack's onw private element ArrayLIst
        // User can then manipulate the underlying list in ways that violate Stack rules
        // return (ArrayList<E>) elements;

        ArrayList<E> copy = new ArrayList<E>(elements);
        return copy;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = toArrayList();
        // We have reverse so thtat it iterates like a stack
        Collections.reverse(copy);

        // When iterator() is called, it returns the Iterator interface which provides methods to traverse
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return elements.size();
    }

    // ? What does <? extends Integer> mean?
    // This method accepts parameters that are a Stack of elements that are of type Integer or a subclass of Intger
    // MyInteger extends Integer

    // ? Why don't we just do Stack<Integer>?
    // MyInteger extends Integer

    // ? What is the difference between `?` and E?
    // E first = copy.get(0)
    //` ? first = copy.get(0) <- does not work 

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int total = 0;
        // for (Integer element : stack) {
        //     total += element;
        // }

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
        // <?> is an unbounded wildcard
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