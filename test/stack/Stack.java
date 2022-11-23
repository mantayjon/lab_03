 /*
    Implement a class Stack.java as discussed in the lecture, using a linkedlist of objects that you implement yourself.
    Your class should include both an exception on stack underflow as well as stack overflow.
    Override the toString() method to provide a useful way of printing a stack.
    Now make it generic, so it can take values of any type. Coordinate your interface with your partner.
    Use the provided JUnit test class to make sure your Stack works correctly. Are there any test methods you can add?
     */

package stack;

public interface Stack<E> {

    public boolean isEmpty();

    public E top() throws Underflow;

    public void push(E element);

    public E pop() throws Underflow;

}

