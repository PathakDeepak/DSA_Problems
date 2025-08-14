package sliding_window;


/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *</p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSumSubArray(arr);
        System.out.println(result);

    }

    private static int maxSumSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int windowStart = -1, windowEnd = -1;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum == 0) windowStart = i;
            currentSum =currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                windowEnd = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
            windowEnd++;
        }
        System.out.println(windowStart + ":" + windowEnd);
        return maxSum;
    }
}
