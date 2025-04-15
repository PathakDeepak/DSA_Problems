package arrays;

import java.util.Arrays;

/**
 * Given an array of integers arr[] and an integer target.
 *
 * 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
 *
 * 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
 *
 * Note: You are not allowed to use the same element twice.
 * Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 12;
        //Solution s = new Solution();
        //Solution result = sumExist(arr, target, s);
        //System.out.println(result.isPariExist() + ":" + result.getIndex_1() + ":" + result.getIndex_2());
        boolean result  = twoSum(arr, target);
        System.out.println(result);

    }

    private static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return false;

    }

   /* private static Solution sumExist(int[] arr, int target, Solution s) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    s.setIndex_1(i);
                    s.setIndex_2(j);
                    s.setPariExist(true);
                    return s;
                }
            }
        }
        s.setIndex_1(-1);
        s.setIndex_2(-1);
        s.setPariExist(false);
        return s;
    }*/
}
/*class Solution {
    int index_1, index_2;
    boolean pariExist;

    public boolean isPariExist() {
        return pariExist;
    }

    public void setPariExist(boolean pariExist) {
        this.pariExist = pariExist;
    }

    public int getIndex_1() {
        return index_1;
    }

    public int getIndex_2() {
        return index_2;
    }

    public void setIndex_1(int index_1) {
        this.index_1 = index_1;
    }

    public void setIndex_2(int index_2) {
        this.index_2 = index_2;
    }
}*/

