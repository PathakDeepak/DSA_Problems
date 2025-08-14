package sliding_window;


/**
 * Given an array arr[] of integers and a number x,
 * the task is to find the smallest subarray with a sum strictly greater than x.
 * </p>
 * Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
 * Output: 3
 * Explanation: Minimum length subarray is [4, 45, 6]
 * </p>
 * Input: x = 100, arr[] = [1, 10, 5, 2, 7]
 * Output: 0
 * Explanation: No subarray exist
 */
public class SmallestSubarraySumGreater {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,45,6,0,19};
        int x = 51;
        int len = calSmallestSubArray(arr, x);
        System.out.println(len);
    }

    private static int calSmallestSubArray(int[] arr, int x) {
        int windowEnd = 0, windowStart = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        int len = 0;
        int arrLength = arr.length;

        //Expansion
        while(windowEnd < arrLength){
            sum += arr[windowEnd];
            if (sum > x) {
                len = windowEnd-windowStart+1;
                minLen = Math.min(minLen, len);

                //Shrinking
                while (sum > x && windowStart < windowEnd) {
                    sum -= arr[windowStart];
                    windowStart++;
                    if (sum > x){
                        len = windowEnd-windowStart+1;
                        minLen = Math.min(minLen, len);
                    }

                }
            }
            windowEnd++;
        }
        return minLen == Integer.MAX_VALUE?0:minLen;
    }
}
