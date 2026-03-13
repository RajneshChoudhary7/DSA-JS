package Java_Dsa.String;

import java.util.Scanner;

public class vowelsandcons {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        int vowel = 0 ,cons =0 ;
        for(int i=0 ;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel++;
            }
            cons++;
        }


        System.out.println("Vowels = "+vowel);
        System.out.println("consonents = "+cons);
    }
}
