package ch06_Stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<Integer>();
        ms.push(1);
        ms.push(2);

        System.out.println(ms);

        ms.pop();
        ms.pop();
        System.out.println(ms.pop());
    }
}
