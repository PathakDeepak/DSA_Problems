package basicMath;

/**
 * A palindrome is a number that reads the same backward as forward.
 * For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
 */

/*
            Input:N = 4554
            Output:Palindrome Number
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 4553;
        check(n);
    }

    private static void check(int n) {
        int original = n;
        int reverse = 0;
        while (n != 0){
            reverse = reverse * 10 + n%10;
            n = n/10;
        }
        if (reverse == original)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
