import java.util.ArrayDeque;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        // 기본 Stack, Queue 클래스 대신에 ArrayDeque 를 많이 사용.
        // 기본 Stack 과 Queue 의 기능을 포함하면서도 성능이 더 좋기 때문.

        // deque 의 경우 양쪽에서 삽입과 반환이 가능한 구조.

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        // 큐의 크기에 문제가 생겼을 때 offerFirst 는 false 리턴,
        // addFirst 의 경우 exception 을 발생.
        arrayDeque.offerFirst(10);
        System.out.println(arrayDeque);
        arrayDeque.offerLast(-3);
        System.out.println(arrayDeque);
        arrayDeque.push(22);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());

        // peek, poll, size, isEmpty 등 나머지 기능도 동일하게 제공.
    }
}