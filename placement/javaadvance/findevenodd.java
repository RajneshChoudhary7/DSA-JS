package placement.javaadvance;

import java.util.Scanner;

public class findevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num  = sc.nextInt();
         if((num/2)*2 == num){
            System.out.println("even number ");
         }
         else{
            System.out.println("odd number ");
         }
    }   
}
