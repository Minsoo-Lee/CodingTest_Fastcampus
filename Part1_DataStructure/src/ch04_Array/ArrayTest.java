package ch04_Array;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        // Array
        Integer[] data_list = new Integer[10];
        data_list[0]=1;

        System.out.println(data_list[0]);
        System.out.println(data_list[2]);

        Integer data_list1[] = {5, 4, 3, 2, 1};
        Integer[] data_list2 = {1, 2, 3, 4, 5};

        System.out.println(data_list2[0]);
        System.out.println();

        // ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        System.out.println(list1.get(0));

        list1.set(0,5);
        System.out.println(list1.get(0));

        list1.remove(0);
        System.out.println(list1.get(0));

        System.out.println(list1.size());
        System.out.println();

        // 다차원 배열
        Integer data_list3[][]  = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(data_list3[0][1]);
        System.out.println(data_list3[1][1]);

        Integer[][][] data_list4 = { { {1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12} }};
        System.out.println(data_list4[0][1][1]);
        System.out.println(data_list4[1][1][2]);
        System.out.println();

        // 예제1
        System.out.println(data_list4[1][0][1]);
        System.out.println(data_list4[1][1][0]);
        System.out.println(data_list4[1][1][2]);
        System.out.println();

        // 예제2
        String dataset[] = {"Braund, Mr. Owen Harris", "Cummings, Mrs. John Bradley", "Heikkinen, Miss.Laina", "Futrelle, Mrs.Jacques Heath", "Allen, Mr. William Henry"};
        int check = 0;
        for (int i=0; i<dataset.length; i++) {
            if (dataset[0].indexOf("M") >= 0) check++;
        }
        System.out.println(check);
    }
}
