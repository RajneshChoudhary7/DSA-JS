package Java_Dsa.String;

public class firstrepeting {

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";

        s = s.toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ')
                continue;
            if (arr[s.charAt(i) - 'a'] != 0) {
                System.out.println(s.charAt(i));
                return;
            }

            arr[s.charAt(i) - 'a']++;
        }

    }
}
