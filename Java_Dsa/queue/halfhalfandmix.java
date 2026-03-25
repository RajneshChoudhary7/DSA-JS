package Java_Dsa.queue;

import java.util.*;

public class halfhalfandmix {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5,6,7,8};
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(a));
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int size = queue.size();
        System.out.println("pre queue ");
        System.out.println(queue);

        for(int i =0 ; i<(size/2);i++){
            q1.add(queue.poll());
        }

        for(; !q1.isEmpty() ; ){
            q2.add(q1.poll());
            q2.add(queue.poll());
        }

        System.out.println("after half half");
        System.out.println( q2);



    }
}
