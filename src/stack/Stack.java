package stack;

public interface Stack<E> {
	public boolean isEmpty();

	public default E top() throws Underflow {
		return null;
	}

	public void push(E element);

	public E pop() throws Underflow;

}
