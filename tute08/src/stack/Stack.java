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

// ? What is an Iterable interface?

// ? Why does Iterable have E as well? 

// ? What methods does it force us to implement?

public class Stack<E> implements Iterable<E> {
    
    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {}

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return null;
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return null;
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        return null;
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        return null;
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return 0;
    }

    // ? What does <? extends Integer> mean?

    // ? Why don't we just do Stack<Integer>?

    // ? What is the difference between `?` and E?

    public static Integer sumStack(Stack<? extends Integer> stack) {
        return 0;
    }

    /**
     * Pretty print a stack containing arbitrary elements, delimited by "," and enclosed by "[]"
     * "[1, 2, 3]"
     * @param stack
     */
    public static void prettyPrint(Stack<?> stack) {}
        

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