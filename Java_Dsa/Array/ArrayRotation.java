package Java_Dsa.Array;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        k = k % arr.length;

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        System.out.println("Rotated Array:");

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr, int i, int j){

        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
