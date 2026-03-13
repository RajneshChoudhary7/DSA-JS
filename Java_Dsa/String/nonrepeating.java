package Java_Dsa.String;

public class nonrepeating {
    public static void main(String[] args) {
        String s = "everyone";

        s = s.toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(arr[ch - 'a'] == 1){
                System.out.println("First non repeating char: " + ch);
                return;
            }
        }

        System.out.println("No non repeating character");
    }
}
