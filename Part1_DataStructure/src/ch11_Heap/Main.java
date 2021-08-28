package ch11_Heap;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Heap heapTest = new Heap(15);
        System.out.println(heapTest.heapArray);

        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(5);
        heapTest.insert(4);
        heapTest.insert(20);

        System.out.println(heapTest.heapArray);

        heapTest.pop();

        System.out.println(heapTest.heapArray);
    }
}
