package ch16_Search;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index <100; index++) {
            testData.add((int)(Math.random()*100));
        }

        Collections.sort(testData);
        System.out.println(testData);

        // 순차 탐색
        SequentialSearch sSearch = new SequentialSearch();
        System.out.println(sSearch.searchFunc(testData, 4));

        // 이진 탐색
        BinarySearch bSearch = new BinarySearch();
        System.out.println(bSearch.searchFunc(testData, 4));

        String name = "aaabbc";
        System.out.println(name.matches("[abcd]*"));
    }
}
