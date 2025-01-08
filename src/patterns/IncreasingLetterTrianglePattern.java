package patterns;


/*
*           Input Format: N = 6
            Result:   
            A
            A B
            A B C
            A B C D
            A B C D E
            A B C D E F
* */
public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {

        for (int i = 0; i < n; i++) {
            char letter = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }
    }
}
