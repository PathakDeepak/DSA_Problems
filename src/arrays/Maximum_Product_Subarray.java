package arrays;

public class Maximum_Product_Subarray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,-1} ;
        System.out.println(new Maximum_Product_Subarray().maxProduct(nums));

    }

    public int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1, maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
    }
}
