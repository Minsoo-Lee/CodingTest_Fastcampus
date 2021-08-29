package ch13_RecursiveCall;

import java.util.ArrayList;

public class Factorial {

    public int factorialFunc1(int n) {
        if (n>1) {
            return n* this.factorialFunc1(n-1);
        } else return 1;
    }

    public int factorialFunc2(int n) {
        if (n<=1) {
            return 1;
        } else return n * this.factorialFunc2(n-1);
    }

    public int exercise(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        } return dataList.get(0) + this.exercise(new ArrayList<Integer> (dataList.subList(1, dataList.size())));
    }

    public int exercise2(int data) {
        if (data == 1) return 1;
        else if (data == 2) return 2;
        else if (data == 3) return 4;

        return this.exercise2(data-1) + this.exercise2(data-2) + this.exercise2(data-3);
    }
}
