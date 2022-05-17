package JAVA;

// 지불해야 하는 값이 4720원일 때 1원, 50원, 100원, 500원 동전으로 동전의 수가 가장 적게 지불하시오 

class Greedy {
    public static void main(String[] args) {
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
    }
}