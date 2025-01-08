package patterns;


/*
*            *
            ***
           *****
          *******
         *********
        ***********
* */
public class StarPyramid {
    public static void main(String[] args) {
        int n = 10;
        printPattern(n);
    }

    private static void printPattern(int n) {
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
