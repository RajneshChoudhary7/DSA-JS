package Java_Dsa.String;

public class slidingwondow {
    static boolean check_vowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static void main(String[] args) {
        String s="everyonelearningjavadsa";
        int k =5;
        int ans = 0, cmax =0;
        for(int i=0 ;i<k;i++){
            if(check_vowel(s.charAt(i))){
                cmax++;
            }
        }
        ans=cmax;
        for(int i=k;i<s.length();i++){
            if(check_vowel(s.charAt(i)))cmax++;;
            if(check_vowel(s.charAt(i-k)))cmax--;
            ans=Math.max(cmax, ans);

        }
        System.out.println("maximum vowels count is = "+ans);

    }
}
