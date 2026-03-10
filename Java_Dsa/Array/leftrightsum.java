package Java_Dsa.Array;

public class leftrightsum {
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];

        for(int i = 1 ;  i<nums.length;i++){

            left[i] = left[i-1] + nums[i];

        } 

        for(int k =0;k<left.length;k++){
            System.out.print(left[k]+"   ");
            }

            System.out.println();
        
        right[nums.length-1] = nums[nums.length-1];

        for(int i = nums.length-2 ;  i>=0;i--){

            right[i] = right[i+1] + nums[i];
            

        } 

        for(int k =0;k<right.length;k++){
            System.out.print(right[k]+"   ");
            }

        System.out.println();
            for(int i=0 ; i <nums.length;i++){
                if(left[i]==right[i]){
                    System.out.println(i);
                }
            }
        
    }
}
