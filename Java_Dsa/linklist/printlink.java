package Java_Dsa.linklist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class printlink {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(-68);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        HashSet<Integer> map = new HashSet<>();
        for(int i : list){
            map.add(i);
        }

        System.out.println(map);

        // while (list.size() != 0) {
        //     System.out.println(list.getFirst());
        // }

        // for(int i =0; i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        // for(int i : list){
        //     System.out.println(i);
        // }


        // print reverse 
        // int even =0 ;
        // int odd = 0;


        // for(int i =list.size()-1; i>=0;i--){
        //     int val = list.get(i);
        //     if (val % 2 == 0) {
        //         even++;
        //     }
        //     else{
        //         odd++;
        //     }
        // }

        // System.out.println(even);
        // System.out.println(odd);
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // for(int i=0 ; i<list.size();i++){
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        //     if(min>list.get(i)){
        //         min=list.get(i);
        //     }
        // }

        // System.out.println(max +"= max");
        // System.out.println(min +"= min");


        for(int i=0 , j=list.size()-1;i<j;i++,j--){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

        System.out.println(list);



    }
}
