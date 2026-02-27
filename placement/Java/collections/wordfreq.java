package placement.Java.collections;

import java.util.HashMap;
import java.util.Map;

public class wordfreq {
    public static void main(String[] args) {
        String  sentence = "Java is fun and java is Powerful";
        String[] words = sentence.split(" ");
        Map<String , Integer> freqMap = new HashMap<>();

        for(String word : words){
            freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
        }

        System.out.println("word Frequencies: "+freqMap);
    }
}
