package placement.Java;

import java.util.Scanner;

public class sumofnum {
    
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("enter any number to find their sum = ");
        int num = sc.nextInt();
        int copy  = num;
        int sum = 0 ;
        int i = 0;
        int even  = 0;
        int odd = 0;
        int palan = 0;
    
    while(num!= 0 ){

        int rem = num%10;
        sum = sum + rem;
        palan = (palan * 10)+rem;
        if(rem % 2 == 0 ){
            even++;
        }
        else{
            odd++;
        }
        num = num/10; 
        i++;
    }
    System.out.println(sum);
    System.out.println(palan);
    System.out.println("even = "+even);
    System.out.println("odd = "+odd);
    if(copy == palan){
        System.out.println("number is palandrom = " + palan);
    }
    else{
        System.out.println("number is not  palandrom = " + palan);
    }

    sc.close();
    }
    
}
