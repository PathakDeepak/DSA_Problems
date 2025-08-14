package TopCommonQuestions;

import java.util.Scanner;

/**
 * An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.
 * listen == silent
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two String :");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean status = isAnagram(s1, s2);
        if (status)
            System.out.println(s1 + " and " + s2 + " are Anagram");
        else
            System.out.println(s1 + " and " + s2 + " are not Anagram");
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
            return false;
        String s1 = str1.replaceAll("[\\s]", "");
        String s2 = str2.replaceAll("[\\s]", "");
        boolean status = true;

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            status = count[i] == 0;
        }
        return status;
    }
}
