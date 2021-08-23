package ch06_Stack;

import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> stackArray = new ArrayList<T>();

    public void push(T data) {
        stackArray.add(data);
    }

    public T pop() {
        if (stackArray.isEmpty()) return null;
        else return stackArray.remove(stackArray.size()-1);
    }

    public String toString() {
        String result = "";
        for (T data : stackArray) result += data.toString() + " ";
        return result;
    }
}
