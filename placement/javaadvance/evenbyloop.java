package placement.javaadvance;

import java.util.Scanner;

public class evenbyloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number : ");
        int num  = sc.nextInt();
        int temp = num;
        while (temp > 1) {
            temp = temp - 2;
        }
        if(temp == 0){
            System.out.println("even number ");
        }
        else{
            System.out.println("odd number ");
        }
        }
        catch(Exception e){
            System.out.println("Error");
        }finally{
            System.out.println("Always run");
        }

        
    }
}
