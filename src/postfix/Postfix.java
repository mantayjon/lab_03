package postfix;

import stack.Stack;
import stack.Underflow;

public class Postfix {

	public String infixToPostfix(String infix) {
		// TODO Auto-generated method stub
		return null;
	}

	public double evaluate(String postfix) throws Underflow {
		Stack<Integer> stack = null;
		double r = 0;
		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			double x = 0;
			double y = 0;
			r = 0;
			if (Character.isDigit(c)) {
				int t = Character.getNumericValue(c);
				stack.push(t);
			} else if (c == '+') {
				x = stack.pop();
				y = stack.pop();
				r = x + y;
				stack.push(i);
			} else if (c == '-') {
				x = stack.pop();
				y = stack.pop();
				r = x - y;
				stack.push(i);
			} else if (c == '*') {
				x = stack.pop();
				y = stack.pop();
				r = x * y;
				stack.push(i);
			} else if (c == '/') {
				x = stack.pop();
				y = stack.pop();
				r = x / y;
				stack.push(i);
			}
		}


		return r;
	}

}
