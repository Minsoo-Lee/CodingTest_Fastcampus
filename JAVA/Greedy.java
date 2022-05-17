package JAVA;

import java.util.Arrays;
import java.util.Comparator;

class Greedy {
    public static void main(String[] args) {
        // 동전 문제 - 지불해야 하는 값이 4720원일 때 1원, 50원, 100원, 500원 동전으로 동전의 수가 가장 적게 지불하시오 
        int[] money = {500, 100, 50, 1};
        int count = 0;
        int price = 4720;

        for (int i = 0; i < 4; i++) {
            if (price / money[i] != 0) {
                count += price / money[i];
                price %= money[i];
            }
        }
        System.out.println(count);

        // 부분 배낭 문제 - 무게 제한이 k인 배낭에 최대 가치를 가지도록 물건을 넣는 문제 (쪼갤 수 있음)
        Integer[][] object_list = new Integer[][] {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        knapsack_function(object_list, 30.0);

    }

    public static void knapsack_function(Integer[][] object_list, double capacity) {
        double total_value = 0.0;
        double fraction = 0.0;
        Arrays.sort(object_list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] object_item1, Integer[] object_item2) {
                return (object_item2[1] / object_item2[0]) - (object_item1[1] / object_item2[0]);
            }
        });
        
        for (int index = 0; index < object_list.length; index++) {
            if ((capacity - (double)object_list[index][0]) > 0) {
                capacity -= (double)object_list[index][0];
                total_value += (double)object_list[index][1];
                System.out.println("무게 : " + object_list[index][0] + ", 가치 : " + object_list[index][1]);
            } else {
                fraction = capacity / (double)object_list[index][0];
                total_value += (double)object_list[index][1] * fraction;
                System.out.println("무게 : " + object_list[index][0] + ", 가치 : " + object_list[index][1] + ", 비율 : " + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치 : " + total_value);
    }
}