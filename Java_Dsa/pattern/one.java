package Java_Dsa.pattern;

import java.util.Scanner;

public class one {
    static void print4(int n){
        for(int i =1 ; i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print4(n);
    }
}
