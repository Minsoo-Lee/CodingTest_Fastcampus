package ch06_Stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<Integer>();

        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int);

        stack_int.pop();
        stack_int.pop();
        stack_int.pop();

        System.out.println(stack_int);
    }
}
