package patterns;

/*
*               * * * * * *
                * * * * *
                * * * *
                * * *
                * *
                *
* */
public class InvertedRightPyramid {
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
