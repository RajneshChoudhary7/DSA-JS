package Java_Dsa.Array;

public class duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] sum = new int[nums.length];

        sum[0] = nums[0];

        for(int i = 1 ;  i<nums.length;i++){

            sum[i] = sum[i-1] + nums[i];

        } 
        for(int k =0;k<sum.length;k++){
            System.out.print(sum[k]+"   ");
            }

    }
}
