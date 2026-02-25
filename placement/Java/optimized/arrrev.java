package placement.Java.optimized;

import java.util.Scanner;




public class arrrev {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tge size of array  = ");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("now enter the values of array "+size+" times : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("before reverse");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        for(int i =0 ,j=size-1 ; i<j;i++,j--){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
        System.out.println("after reverse");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
