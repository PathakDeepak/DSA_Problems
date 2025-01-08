package patterns;


/*
*       Input Format: N = 6
        Result:
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
* */
public class AlphaRampPattern {
    public static void main(String[] args) {
        int n = 6;
        char letter = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letter + " ");
            }
            letter++;
            System.out.println();
        }
    }
}
