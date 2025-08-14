package TopCommonQuestions;

/**
 * This problem asks to generate the Fibonacci sequence up to the nth term.
 * In this sequence, each number is the sum of the two preceding ones, starting from 0 and 1.
 * <p>
 * The goal is to calculate and display all Fibonacci numbers from the 0th to the nth term.
 * Example for n = 10:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * (Writing: Start with 0 and 1 → 0+1=1 → 1+1=2 → 1+2=3 → 2+3=5 → and so on.)
 */
public class Fibonacci_Till_Nth_Term {
    public static void main(String[] args) {
        int num = 15;
        int a = 0, b = 1;

        // Here we are printing 0th and 1st terms
        System.out.print(a + " , " + b + " , ");

        int nextTerm;

        // printing the rest of the terms here
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}
