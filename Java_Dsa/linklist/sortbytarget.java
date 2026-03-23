package Java_Dsa.linklist;

import java.util.LinkedList;

public class sortbytarget {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(2);
        list.addFirst(4);
        list.addLast(34);

        int target = 4;

        while (!list.isEmpty()) {
            int val = list.removeFirst();
            if(val<list.get(target)){
                left.add(val);
            }
            else{
                right.add(val);
            }
        }
        
        System.out.print(left+"  ");
        System.out.print(right+"  ");


    }

}
