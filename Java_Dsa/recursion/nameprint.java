package Java_Dsa.recursion;

import java.util.Scanner;

public class nameprint {

    static void print(int i ,int n){
        if (i>n) {
            return;
        }
        System.out.println("Rajnesh");
        print(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
    }
}
