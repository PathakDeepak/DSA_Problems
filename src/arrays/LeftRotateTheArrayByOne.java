package arrays;

import java.util.Arrays;

/**
 * Problem Statement: Given an array of N integers, left rotate the array by one place.
 *
 * Example 1:
 * Input:
 *  N = 5, array[] = {1,2,3,4,5}
 * Output:
 *  2,3,4,5,1
 */

public class LeftRotateTheArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        leftRotate(arr);
    }

    private static void leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        Arrays.stream(arr).forEach(System.out::print);
    }
}
