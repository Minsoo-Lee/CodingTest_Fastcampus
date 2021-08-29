package ch13_RecursiveCall;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Factorial fObject = new Factorial();
        System.out.println(fObject.factorialFunc1(9));
        System.out.println(fObject.factorialFunc2(9));

        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(0);
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);
        dataList.add(4);
        dataList.add(5);
        dataList.add(6);
        dataList.add(7);
        System.out.println(fObject.exercise(dataList));

        System.out.println(fObject.exercise2(5));
        System.out.println(fObject.exercise2(6));
    }
}
