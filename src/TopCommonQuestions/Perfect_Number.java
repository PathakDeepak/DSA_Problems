package TopCommonQuestions;

import java.util.Scanner;

/**
 * A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding the number itself.
 * Example: Is 28 a perfect number?
 * The divisors of 28 are 1, 2, 4, 7, 14.
 * Sum of divisors: 1 + 2 + 4 + 7 + 14 = 28, so 28 is a perfect number
 */
public class Perfect_Number {
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1; // 1 is always a proper divisor
        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                int pairDivisor = num / i;
                if (pairDivisor != i) {
                    sum += pairDivisor;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }
    }
}
