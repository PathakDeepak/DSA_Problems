package search_algo.binarySearch;

public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;

        int res = smallestDivisor(nums, threshold);
        System.out.println(res);
    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            end = Math.max(end, nums[i]);
        }

        int res = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (divisorLessThanThreshold(nums, mid) <= threshold) {
                res = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return res;
    }

    private static int divisorLessThanThreshold(int[] nums, int mid) {
        int currentTotalDivisor = 0;
        for (int i = 0; i < nums.length; i++) {
            currentTotalDivisor += (int) Math.ceil((double) nums[i] /mid);
        }

        return currentTotalDivisor;
    }
}
