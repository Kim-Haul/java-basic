import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(7);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println("size: " + stack.size());

        System.out.println(stack.contains(1));
        System.out.println(stack.empty());
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}