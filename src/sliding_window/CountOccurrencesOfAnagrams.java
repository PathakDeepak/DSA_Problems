package sliding_window;

import java.util.Arrays;

/**
 * Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.
 * Input: txt = "forxxorfxdofr", pat = "for"
 * Output: 3
 * Explanation: for, orf and ofr appears in the txt, hence answer is 3.
 */
public class CountOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String txt = "eaylnlfdxf";
        String pat = "irc";
        int result = countAnagramOccur(txt, pat);
        System.out.println(result);
    }

    private static int countAnagramOccur(String txt, String pat) {
        int count  = 0;
        int[] txtArr = new int[26];
        int[] patArr = new int[26];
        int n = txt.length();
        int k = pat.length();
        for (char ch: pat.toCharArray()){
            patArr[ch-97]++;
        }
        int index = 0;
        while(index < k) {
            char ch = txt.charAt(index);
            txtArr[ch-97]++;
            index++;
        }
        if (Arrays.equals(patArr, txtArr))
            count++;
        for (int i = 1; i < n-k+1; i++) {
            char remove = txt.charAt(i-1);
            char add = txt.charAt(i+k-1);
            txtArr[remove-97]--;
            txtArr[add-97]++;
            if (Arrays.equals(patArr, txtArr))
                count++;
        }
        return count;
    }
}
