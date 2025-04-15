package arrays;

/**
 * Given an integer array arr, find the contiguous subarray (containing at least one number) which
 * has the largest sum and returns its sum and prints the subarray.
 */
public class MaximumSubarraySumArray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("\nThe maximum subarray sum is: " + maxSum);
    }

    private static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int ansStart = 0, ansEnd = -1;
        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        return maxi;
    }
}
