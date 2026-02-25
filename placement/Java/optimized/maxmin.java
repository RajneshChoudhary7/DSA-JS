package placement.Java.optimized;

import java.util.Scanner;

public class maxmin {
    static int max(int size , int[]arr){
        int max = arr[0];
        for(int i = 0 ; i<size ; i++){
            
            if(max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tge size of array  = ");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("now enter the values of array "+size+" times : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int value  = max(size, arr);
        System.out.println(value);

        sc.close();
    }
}
