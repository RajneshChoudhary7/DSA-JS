package Java_Dsa.queue;

import java.util.*;

public class insertandmax {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6,7,8};
        int k = 3;
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(a));
        Queue<Integer> c1 = new LinkedList<>(Arrays.asList(a));

        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += queue.poll();
        }

        int max = sum;
        int min = sum;
                        
        

        
        while (!queue.isEmpty()) {
            sum += queue.poll();   
            sum -= c1.poll();      
            max = Math.max(max, sum); 
            min = Math.min(min, sum); 
        }

        System.out.println("final max sum = " + max);
        System.out.println("final max sum = " + max);
        System.out.println("final max sum = " + min);
        System.out.println("final max sum = " + min);
    }
}