package ch14_DPandDC;

public class Fibonacci {
    public int fibonacciFunc(int data) {
        if (data <= 1) return data;

        return this.fibonacciFunc(data-1) + this.fibonacciFunc(data-2);
    }

    public int dynamicFunc(int data) {
        int[] cache = new int[data+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index=2; index <data+1; index++) {
            cache[index] = cache[index-1] + cache[index-2];
        }
        return cache[data];
    }
}
