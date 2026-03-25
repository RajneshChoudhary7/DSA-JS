package Java_Dsa.queue;

import java.util.Queue;
import java.util.LinkedList;

public class binaryconvert {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();
        int n = 4;
        queue.add("1");
        if(n==0){
            System.out.println("0");
            return;
        }
        for(int i=0 ; i<n ; i++){
            String  curr = queue.poll();
            System.out.println(curr);
            queue.add(curr + "0");
            queue.add(curr + "1");
        }
    }
}
