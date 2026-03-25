package Java_Dsa.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuebyll {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack  = new Stack<>();
        int k =3 ;
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(8);
        queue.add(10);

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }


        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.remove());
        }

        System.out.println(queue);

    }
}
