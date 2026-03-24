package Java_Dsa.Array;

public class sufixsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int [] sum = new int[n];

        sum[n-1] = arr[n-1];
        for(int i=n-2 ; i>=0;i--){
            sum[i] = sum[i+1] + arr[i];
        }

        for(int j : sum){
            System.out.println(j);
        }
    }
}