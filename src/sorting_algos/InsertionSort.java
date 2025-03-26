package sorting_algos;

import java.util.Arrays;

/*
    Time Complexity: O(N2) for the worst and average cases and O(N) for the best case as inner loop will not run.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {13,46,24,52,20,9};
        int[] result = sortInsertion(arr, n);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] sortInsertion(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}
