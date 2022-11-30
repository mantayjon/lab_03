package stack;

public class LinkedListStack<Char> implements Stack<Char> {
	private Char stack[];
	private int capacity;

	private class Node {

		int data; // integer data
		Node link; // reference variable Node type
	}

	Node top;

	public LinkedListStack() { this.top = null; }

	@Override
	public boolean isEmpty() {
		return stack.length == 0;
	}

	@Override
	public Char top() throws Underflow {
		return stack[stack.length-1];
	}

	@Override
	public void push(Char element) {
		Node temp = new Node();

		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}

		temp.data = (int) element;

		temp.link = top;

		top = temp;
	}

	@Override
	public Char pop() {
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return null;
		}

		// update the top pointer to point to the next node
		top = (top).link;
		return (Char) top;
	}

	@Override
	public String toString() {
		String result = "";
		for(Object object : stack){
			result = result + " " + object.toString();
		}
		return result;
	}
}
