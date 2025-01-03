package Arrays;
/*
* Given an integer array nums, find the subarray with the largest sum, and return its sum.
  Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
* */

import java.util.Arrays;

public class Maximum_SubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4} ;
        int result = new Maximum_SubArray().maxSubArray(nums);
        System.out.println(result);
    }

    public int maxSubArray (int[] nums) {
        int maxUntilNow = nums[0];
        int currentMaxValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentMaxValue < 0)
                currentMaxValue = 0;
            currentMaxValue = currentMaxValue + nums[i];
            if (currentMaxValue > maxUntilNow)
                maxUntilNow = currentMaxValue;
        }
        return maxUntilNow;
    }

}
