package TopCommonQuestions;


import java.util.HashMap;
import java.util.Map;

/**
 * The goal is to determine how many times each character appears in the string.
 * Example for string “hello”:
 * ‘h’ appears 1 time
 * ‘e’ appears 1 time
 * ‘l’ appears 2 times
 * ‘o’ appears 1 time
 */
public class Calculate_Frequency_Of_Characters {

    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c == ' ')
                continue;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for ( Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
