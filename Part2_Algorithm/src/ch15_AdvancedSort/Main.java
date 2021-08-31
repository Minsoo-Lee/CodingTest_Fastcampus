package ch15_AdvancedSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testData1 = new ArrayList<>();
        ArrayList<Integer> testData2 = new ArrayList<>();

        for (int i=0; i<100;i++) {
            testData1.add((int)(Math.random()*100));
            testData2.add((int)(Math.random()*100));
        }

        // 병합 정렬
        MergeSort mSort = new MergeSort();
        System.out.println(mSort.mergeSplitFune(testData1));

        // 퀵 정렬
        QuickSort qSort = new QuickSort();
        System.out.println(qSort.sort(testData2));
    }
}
