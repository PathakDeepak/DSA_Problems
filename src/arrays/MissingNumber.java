package arrays;

import java.util.Arrays;

/**
 * Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
 * Find the number(between 1 to N), that is not present in the given array.
 *
 * Example 1:
 * Input Format:
 *      N = 5, array[] = {1,2,4,5}
 * Result:
 *      3
 */
public class MissingNumber {
    public static void main(String[] args) {
        int N = 5;
        int array[] = {1,2,4,5};

        int missed = findMissing(array, N);
        System.out.println(missed);
    }

    private static int findMissing(int[] array, int n) {
        int currentTotal = Arrays.stream(array).sum();
        int summation = n*(n+1)/2;
        return summation-currentTotal;
    }

}
