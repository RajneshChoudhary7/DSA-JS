package Java_Dsa.arraylist;

import java.util.ArrayList;

public class first {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(3,34);

        list.set(3, 5);
                list.remove(3);
        System.out.println(list);

    }
}
