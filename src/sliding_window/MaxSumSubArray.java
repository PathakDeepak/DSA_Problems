package sliding_window;


/**
 * Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
 * Example:
 *  Input:
 *      N = 4, K = 2
 *      Arr = [100, 200, 300, 400]
 *  Output:
 *      700
 *  Explanation:
 *      Arr3  + Arr4 =700,
 *      which is maximum. .
 */
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4} ;
        int k = 3;
        int result = maxSubArray(nums, k);
        System.out.println(result);
    }

    private static int maxSubArray(int[] nums, int window) {
       int index = 0;
       int len = nums.length;
       int sum = 0, max;
       while (index < window){
           sum += nums[index];
           index++;
       }
       max = sum;
       for (int i = 1; i < len-window+1; i++){
           int preElement = nums[i-1];
           int nextElement = nums[i+window-1];
           sum = sum - preElement + nextElement;
           max = Math.max(max, sum);
       }

       return max;
    }
}
