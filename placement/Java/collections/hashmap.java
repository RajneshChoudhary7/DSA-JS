package placement.Java.collections;

import java.util.HashMap;

import placement.Java.string;

public class hashmap {
    public static void main(String[] args) {
        String  str = "hello";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(map);
    }   

}
