package Java_Dsa.String;

public class panagram {

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";

        s = s.toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }

        boolean isPangram = true;

        for (int i = 0; i < 26; i++) {

            if (arr[i] == 0) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("String is Pangram");
        } else {
            System.out.println("String is NOT Pangram");
        }
    }

}
