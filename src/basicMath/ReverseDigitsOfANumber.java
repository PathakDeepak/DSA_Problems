package basicMath;


/*
*       Input:N = 12345
        Output:54321                &
        N = 1400
        Output:41
* */
public class ReverseDigitsOfANumber {
    public static void main(String[] args) {
        int n = 10400;
        reverseDigit(n);
    }

    private static void reverseDigit(int n) {
        int result = 0;
        while(n != 0) {
            result = result * 10 + n%10;
            n = n/10;
        }
        System.out.println(result);

    }
}
