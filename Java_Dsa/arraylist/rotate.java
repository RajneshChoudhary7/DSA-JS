package Java_Dsa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class rotate {
    
    public static void main(String[] args) {
        ArrayList<Integer> lst  = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        lst.addAll(Arrays.asList(9,10,11,12));
        System.out.println(lst);
        int k = 2;
        for(int i=0 , j=lst.size()-1;k!=0 && i<j ;){

            int temp = lst.get(i);
            lst.set(i, lst.get(j));
            lst.set(j, temp);
            i++;
            j--;
            k--;
        }
        System.out.println(lst);
    }
}
