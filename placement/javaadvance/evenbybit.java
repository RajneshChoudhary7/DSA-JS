package placement.javaadvance;

import java.util.Scanner;

public class evenbybit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num  = sc.nextInt();
         if((num & 1) == 0){
            System.out.println("even number ");
         }
         else{
            System.out.println("odd number ");
         }
    }
}
