import postfix.Postfix;
import stack.Underflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Underflow {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Calculation:");
        System.out.println("--------------------");

        String input = sc.nextLine();

        System.out.println(Postfix.infixToPostfix(input));

    }
}
