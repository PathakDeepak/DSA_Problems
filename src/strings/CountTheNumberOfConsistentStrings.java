package strings;

import java.util.HashSet;

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *</p>
 * Return the number of consistent strings in the array words.
 *</p>
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 */
public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[]{"ad","bd","aaab","baa","badab"};
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for (String str: words) {
            boolean flag = true;
            for (int i = 0; i <str.length(); i++) {
                if (!set.contains(str.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) counter++;
        }
        return counter;
    }
}
