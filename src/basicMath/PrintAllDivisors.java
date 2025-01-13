package basicMath;


import java.util.ArrayList;

/*
 *      Input:N = 36
        Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
 */
public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 36;
        printDivisor(n).stream().sorted().forEach(x -> System.out.print(x + " "));

    }

    private static ArrayList<Integer> printDivisor(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n%i == 0) {
                divisors.add(i);
                if (i != n/i)
                    divisors.add(n/i);
            }
        }
        return divisors;
    }
}
