package patterns;

/*
*                       1
                        2 2
                        3 3 3
                        4 4 4 4
                        5 5 5 5 5
                        6 6 6 6 6 6
* */
public class RightAngledNumberPyramid2 {
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
