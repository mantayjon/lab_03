package stack;

import javax.swing.text.html.parser.Element;

public class StackClass implements Stack{

    private Object stack[ ];
    private int tos;

    StackClass(int size) {
        stack=new Object[size];
        tos=-1;
    }
    @Override
    public boolean isEmpty() {
        if (stack.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object top() throws Underflow {
        return null;
    }

    @Override
    public void push(Object element) {
        if(tos==stack.length-1)
        {
            System.out.println("Stack Overflows");
            Object t[]=new Object[stack.length * 2];
            for(int i=0;i<stack.length;i++)
                t[i]=stack[i];
            stack=t;
            stack[++tos]=element;
        }
        else
            stack[++tos]=element;
    }

    @Override
    public Object pop() throws Underflow {
        if(tos<0)
        {
            System.out.println("Stack Underflows");
            return null;
        }
        else
            return stack[tos--];
    }


}
