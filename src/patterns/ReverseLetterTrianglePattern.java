package patterns;

/*
*           Input Format: N = 6
            Result:
            A B C D E F
            A B C D E
            A B C D
            A B C
            A B
            A
* */
public class ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char letter = 65;
            for (int j = n; j > i; j--) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }
    }
}
