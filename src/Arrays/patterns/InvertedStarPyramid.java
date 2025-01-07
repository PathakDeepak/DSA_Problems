package Arrays.patterns;

/*
*                       ***********
                         *********
                          *******
                           *****
                            ***
                             *
* */
public class InvertedStarPyramid {
    public static void main(String[] args) {
        int n = 10;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print("*");
            }
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
