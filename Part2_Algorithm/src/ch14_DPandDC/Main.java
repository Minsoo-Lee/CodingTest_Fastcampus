package ch14_DPandDC;

public class Main {
    public static void main(String[] args) {
        Fibonacci fObject = new Fibonacci();
        System.out.println(fObject.fibonacciFunc(10));
        System.out.println(fObject.dynamicFunc(10));
    }
}
