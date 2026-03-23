package Java_Dsa.arraylist;

import java.util.ArrayList;

public class freqcount {
    public static void main(String[] args) {

        System.out.println("rajnesh king ");
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(23);
        lst.add(4);
        lst.add(2);
        lst.add(3);
        lst.add(3);
        lst.add(9);
        lst.add(2);

        frequency(lst);
    }

    static void frequency(ArrayList<Integer> lst){
        if(lst.isEmpty())return;

        int element = lst.get(0);
        int count =0 ;

        for(int i=0 ; i<lst.size() ; i++){
            if(lst.get(i).equals(element)){
                count++;
            }
        }

        System.out.println( element+ "--->"+count);

        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0 ;i<lst.size();i++){
            if(!lst.get(i).equals(element)){
                newList.add(lst.get(i));
            }
        }

        frequency(newList);
    }
}
