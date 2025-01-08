package patterns;


/*
*   N=6          *
                 **
                 ***
                 ****
                 *****
                 ******
                 *****
                 ****
                 ***
                 **
                 *
* */
public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
