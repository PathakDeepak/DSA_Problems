package sliding_window;

/**
 * You are given a string s consisting only lowercase alphabets and an integer k.
 * Your task is to find the length of the longest substring that contains exactly k distinct characters.
 * If no such substring exists, return -1.
 * </p>
 * Input: s = "aabacbebebe", k = 3
 * Output: 7
 * Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
 */
public class LongestSubstringWithKUniques {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int n = s.length();
        int result = calcLongestSubArray(s, k, n);
        System.out.println(result);
    }

    private static int calcLongestSubArray(String s, int k, int n) {
        int windowStart = 0 , windowEnd = 0, uniqueCharacterCount = 0 , len = 0;
        int maxLen = Integer.MIN_VALUE;
        int[] charFrequency = new int[26];

        //Expansion
        while (windowEnd < n) {
            int index = s.charAt(windowEnd) - 97;
            if (charFrequency[index] == 0) {
                uniqueCharacterCount++;
            }
            charFrequency[index]++;
            if (uniqueCharacterCount == k){
                len = windowEnd-windowStart+1;
                maxLen = Math.max(maxLen, len);
            }
            if (uniqueCharacterCount > k){
                while (uniqueCharacterCount > k && windowStart < windowEnd){
                    index = s.charAt(windowStart) - 97;
                    charFrequency[index]--;
                    windowStart++;
                    if (charFrequency[index] == 0) {
                        uniqueCharacterCount--;
                    }
                }
            }
            windowEnd++;
        }
        return maxLen == Integer.MIN_VALUE?-1:maxLen;
    }

}
