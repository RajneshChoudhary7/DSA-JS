package placement.Java;

import java.util.Scanner;

public class findmax {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the lenght of array =  ");
        int size = sc.nextInt();
        int[] arr =new int [size];
        for(int i = 0 ; i<=size-1 ; i++){
            arr[i] = sc.nextInt();
        }
        // int max = arr[0];
        // int secondmax = arr[1];
        // for(int i=2; i<arr.length;i++){
        //     if(max<arr[i])
        //     {
        //         if(secondmax<max){
        //             secondmax = max;
        //         }

        //         max = arr[i];
        //     }

        // }
        // System.out.println("Max = "+max);
        // System.out.println("second max " +secondmax);













        if(arr.length < 2){
            System.out.println("Array must have at least 2 element ");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num :arr){
            if(num > max){
                secondMax = max;
                max = num;
            }

            else if( num>secondMax && num != max){
                secondMax = num;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Second Max = " + secondMax);

    }
}
