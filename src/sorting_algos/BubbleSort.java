package sorting_algos;

import java.util.Arrays;

/*
* After each iteration max element is pushed to last index of current outer index
*
* Time Complexity: O(N2) for the worst and average cases and O(N) for the best case.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int n =6;
        int[] arr = {13,46,24,52,20,9};
        int[] result = bubbleSort(arr, n);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] bubbleSort(int[] arr, int n) {
        for (int i = n-1; i >= 0; i--) {
            //The best case occurs if the given array is already sorted. We can reduce the time complexity to O(N)
            // by just adding a small check inside the loops.
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap++;
                }
            }
            if (didSwap == 0) break;
        }
        return arr;
    }
}
