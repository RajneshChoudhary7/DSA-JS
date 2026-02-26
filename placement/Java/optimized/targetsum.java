package placement.Java.optimized;

import java.util.HashMap;

public class targetsum {
    public static void main(String[] args) {
         
        //  for(int i =0 ; i<arr.length-1;i++){
        //     for(int j = 0 ; j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+"  "+arr[j]);
        //         }
        //     }
        //  }


        int[] arr = {1,2,3,4,5};
        int target  = 6;
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i = 0 ; i<arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                System.out.println(arr[map.get(diff)]+"  "+arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
    }
}
