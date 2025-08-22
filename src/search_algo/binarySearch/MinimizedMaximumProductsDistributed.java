package search_algo.binarySearch;

import java.util.Arrays;

public class MinimizedMaximumProductsDistributed {
    public static void main(String[] args) {
        int n = 7;
        int[] quantities = {15,10,10};
        int res = minimizedMaximum(n, quantities);
        System.out.println(res);
    }

    public static int minimizedMaximum(int n, int[] quantities) {
        int start = 1;
        int end = Arrays.stream(quantities).max().getAsInt();
        while (start < end) {
            int mid = start + (end-start)/2;
            if (distributionPossible(quantities, mid, n)){
                end = mid;
            }
            else start = mid+1;
        }
        return start;
    }

    private static boolean distributionPossible(int[] quantities, int mid, int n) {
        long storesNeeded = 0;
        for (int q : quantities) {
            storesNeeded += (q+mid-1)/mid;
            if (storesNeeded > n) return false;
        }
        return true;
    }
}

