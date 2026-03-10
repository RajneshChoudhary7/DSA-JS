package Java_Dsa.Array;

public class twopinter {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10,12};
        int target = 15;
        int count = 0 ;
        int i = 0 , j=arr.length-1;
        while(i<j){
            int sum  = arr[i]+arr[j];
            if(sum == target){
                System.out.println("Pair is present " + arr[i]+" + "+arr[j]+ " = "+target);
                count++;
                i++;
                j--;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
            
        }
        if(count == 0){
            System.out.println("no pair found");
        }
        else{
            System.out.println("Total pairs:" + count);
        }
    }
}
