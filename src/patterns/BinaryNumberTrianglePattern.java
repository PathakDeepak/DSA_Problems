package patterns;


/*
*  N = 6        1
                01
                101
                0101
                10101
                010101
* */
public class BinaryNumberTrianglePattern {
    public static void main(String[] args) {
        int num  = 6;
        printPattern(num);
                
    }

    private static void printPattern(int num) {
        int start = 1;
        for (int i = 0; i < num; i++) {
            if (i%2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
