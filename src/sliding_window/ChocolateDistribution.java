package sliding_window;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(findMinDiff(arr, m));
    }

    private static int findMinDiff(int[] arr, int m) {
        Arrays.sort(arr);
        int len = arr.length;
        int min = arr[m-1] - arr[0];
        for (int i = 1; i < len-m+1; i++) {
            min = Math.min(min, arr[i+m-1] - arr[i]);
        }
        return min;
    }
}

