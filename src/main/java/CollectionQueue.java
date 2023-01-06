import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(5);
        queue.add(3);
        System.out.println(queue);
        // 스택의 pop 과 비슷하게, queue 의 제일 앞에 있는 것 빼기
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
