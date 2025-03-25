package arrays;

/**
 * Problem Statement: Given an array, find the second smallest and second-largest element in the array.
 * Print ‘-1’ in the event that either of them doesn’t exist.
 */
public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        //int arr[] = {2,3};
        int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("second Smallest: " + sS + "\nsecond Largest: " + sL);
    }

    private static int secondSmallest(int[] arr, int n) {
        if (n<2)
            return -1;
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            }
            else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    private static int secondLargest(int[] arr, int n) {
        if (n<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
