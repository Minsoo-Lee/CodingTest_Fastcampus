package ch19_Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 동전 문제
        /*
        GreedyAlgorithm gObject1 = new GreedyAlgorithm();
        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500, 100, 50, 1));
        gObject1.coinFunc(4720, coinList);
         */

        // 배낭 문제
        GreedyAlgorithm gObject2 = new GreedyAlgorithm();
        Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        gObject2.knapsackFunc(objectList, 30.0);

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        a.addAll(b);
        System.out.println(a);
    }
}


