package Java_Dsa.arraylist;

import java.util.ArrayList;

public class removeduplicate {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(23);
        lst.add(4);
        lst.add(2);
        lst.add(3);
        lst.add(3);
        lst.add(9);
        lst.add(2);


        for(int i=0 ; i<lst.size()-1;i++){
            for(int j =i+1 ; j<lst.size();j++){
                if(lst.get(i)==lst.get(j)){
                    lst.remove(j);
                    j--;
                }
            }
        }

        for(int i : lst){
            System.out.println(i);
        }
    }
}
