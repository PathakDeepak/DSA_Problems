package patterns;


/*
*               Input Format: N = 6
                Result:
                1          1
                12        21
                123      321
                1234    4321
                12345  54321
                123456654321
* */
public class NumberCrownPattern {
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = n, k= i; j > n-i; j--) {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
