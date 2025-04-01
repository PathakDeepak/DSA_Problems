package arrays;


/**
 * Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
 */
public class AppearsOnce {
    public static void main(String[] args) {
        int []arr = {4, 1, 2, 1, 2};
        int result = findAppearOnce(arr);
        System.out.println(result);
    }

    private static int findAppearOnce(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
