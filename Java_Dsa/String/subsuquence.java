package Java_Dsa.String;

public class subsuquence {

    static boolean isSubsequence(String s, String word){
        int i =0 , j=0;
        while (i<s.length() && j< word.length()) {
            if(s.charAt(i) == word.charAt(j)){
                j++;
            }
            i++;
        }

        return j == word.length();
    }
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb" , "acd", "ace"};
        int count=0;
        for(String word : words){
            if(isSubsequence(s,word))count++;
        }
        System.out.println(count);
    }
}
