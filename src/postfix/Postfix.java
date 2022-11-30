package postfix;

import stack.LinkedListStack;
import stack.Stack;
import stack.Underflow;

public class Postfix {

	public static int precedence(char x){

		if(x=='^'){
			return 2;
		}
		else if(x=='*' || x=='/'){
			return 1;
		}
		else if(x=='+' || x=='-'){
			return 0;
		}
		return -1;
	}
	public static String infixToPostfix(String infix) throws Underflow {
		Stack<Character>stk= new LinkedListStack<>();             // used for converting infix to postfix

		String ans="";                // string containing our final answer

		int n= infix.length();

		for (int i = 0; i <n ; i++) {
			char x= infix.charAt(i);

			if(x>='0' && x<='9'){
				ans+=x;
			}

			else if(x=='('){     // push directly in the stack
				stk.push('(');
			}
			else if(x==')'){

				while(!stk.isEmpty() && stk.top()!='('){          // keep popping till opening bracket is found
					ans+=stk.pop();
				}
				if(!stk.isEmpty()){
					stk.pop();
				}

			}
			else{

				while(!stk.isEmpty() && precedence(stk.top())>=precedence(x)){    // remove all higher precedence values
					ans+=stk.pop();
				}
				stk.push(x);

			}
		}
		while(!stk.isEmpty()){
			ans+=stk.pop();
		}
		return ans;
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
