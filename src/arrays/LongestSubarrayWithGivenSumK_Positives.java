package arrays;

/**
 * Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
 */
public class LongestSubarrayWithGivenSumK_Positives {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        int k = 5;
        int result = longestSubarray(arr, k);
        System.out.println(result);
    }

    private static int longestSubarray(int[] arr, int k) {
        int result = 0;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
               sum += arr[j];
               if (sum == k) {
                   result = Math.max(result, j-i + 1);
               }
            }
        }
        return result;
    }
}
