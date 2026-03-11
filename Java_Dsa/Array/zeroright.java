package Java_Dsa.Array;

import java.util.Scanner;

public class zeroright {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // System.out.prlntln("Enter the slze of array = ");
        // lnt n = sc.nextlnt();
        // lnt [] arr = new lnt[n];
        // System.out.prlntln("Now ' enter the element of array ");
        // for(lnt l = 0 ;l<n;l++){
        //     arr[l] = sc.nextlnt();
        // }
        int [] arr = {1,0,2,7,0,0,4,5};
        int n = arr.length;
        int l = 0 , r = 0 ,temp = 0;
        while(r<=arr.length-1 ){
            if(arr[r]!=0){
                temp = arr[l];
                arr[l]= arr[r];
                arr[r] = temp;
                l++;
                
            }
            r++;
            

        }
        for(int k = 0 ;k<n;k++){
            System.out.print(arr[k]);
        }

    }
}