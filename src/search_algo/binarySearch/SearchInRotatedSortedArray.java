package search_algo.binarySearch;

/**
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
 *</p>
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *</p>
 * You must write an algorithm with O(log n) runtime complexity.
 *</p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int res = search(nums, target);
        System.out.println(res);
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[start]) {
                if (target < nums[mid] && target >= nums[start]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[end]) start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}
