package sorting_algos;

import java.util.Arrays;

/*
    Time complexity: O(N2), (where N = size of the array), for the best, worst, and average cases.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {13,46,24,52,20,9};
        int[] result = sortSelection(arr, n);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] sortSelection(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
