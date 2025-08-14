package strings;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * </p>
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = optimized(s);//lengthOfLastWord(s);
        System.out.println(result);
    }
    public static int lengthOfLastWord(String s) {
        String[] str  = s.split(" ");
        return str[str.length-1].length();
    }

    public static int optimized(String s){
        int count = 0 ;
        int i = s.length()-1;
        while (i>=0 && s.charAt(i) == ' ')
            i--;
        while (i>=0 && s.charAt(i) != ' ') {
            i--;
            count++;
        }
        return count;
    }
}
