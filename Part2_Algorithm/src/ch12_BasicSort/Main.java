package ch12_BasicSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> BubbleList = new ArrayList<>();
        ArrayList<Integer> SelectionList = new ArrayList<>();
        ArrayList<Integer> InsertionList = new ArrayList<>();

        for (int i=0; i<100; i++) {
            BubbleList.add((int)(Math.random() * 100));
            SelectionList.add((int)(Math.random() * 100));
            InsertionList.add((int)(Math.random() * 100));
        }

        // BubbleSort
        BubbleSort bSort = new BubbleSort();
        System.out.println(bSort.sort(BubbleList));

        // SelectionSort
        SelectionSort sSort = new SelectionSort();
        System.out.println(sSort.sort(SelectionList));

        // InsertionSort
        InsertionSort iSort = new InsertionSort();
        System.out.println(iSort.sort(InsertionList));

    }
}
