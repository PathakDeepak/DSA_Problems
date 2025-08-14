package sliding_window;

import java.util.HashMap;

/**
 * Given a string s having lowercase characters, find the length of the longest substring without repeating characters.
 * </p>
 * Input: s = "geeksforgeeks"
 * Output: 7
 * Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcdefabcbb";
        int result  = calcLongestSubArrayNonRepeating(s);
        System.out.println(result);
    }

    private static int  calcLongestSubArrayNonRepeating(String s) {
        int n = s.length();
        int windowStart = 0, windowEnd = 0;
        int maxLen = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        while(windowEnd < n) {
            Character ch = s.charAt(windowEnd);
            if (map.containsKey(ch) && windowStart <= map.get(ch)) {
                windowStart = map.get(ch) + 1;
            }
            map.put(ch, windowEnd);
            maxLen = Math.max(maxLen, windowEnd-windowStart+1);
            windowEnd++;
        }
        return maxLen == Integer.MIN_VALUE?0:maxLen;
    }
}
