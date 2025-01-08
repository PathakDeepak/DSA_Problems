package patterns;

/*
 *                                    * * *
                                      * * *
                                      * * *
* */
public class RectangleStarPattern {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);

    }

    private static void printPattern(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
