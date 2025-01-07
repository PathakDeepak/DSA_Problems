package Arrays.patterns;

/*
*   N=6                     *
                           ***
                          *****
                         *******
                        *********
                       ***********
                       ***********
                        *********
                         *******
                          *****
                           ***
                            *
* */
public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 10;
        printPattern(n);
    }

    private static void printPattern(int n) {
        erectPyramid(n);
        invertPyramid(n);
    }

    private static void invertPyramid(int n) {
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

    private static void erectPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
