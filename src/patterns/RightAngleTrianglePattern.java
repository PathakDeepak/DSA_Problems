package patterns;

/*
 *                              *
                                **
                                ***
                                ****
                                *****
* */
public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
