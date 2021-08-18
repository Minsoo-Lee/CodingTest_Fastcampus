package ch05_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // Queue
        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        queue_int.add(1);
        queue_int.offer(2); // 작업이 성공했는지 여부(true, false) 반환
        System.out.println(queue_int);

        queue_int.poll(); // 삭제하는 값 반환
        System.out.println(queue_int);

        queue_int.remove(); // 삭제하는 값 반환
        System.out.println(queue_int);
    }
}
