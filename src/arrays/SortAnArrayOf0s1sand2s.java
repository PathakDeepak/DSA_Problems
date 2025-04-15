package arrays;


import java.util.stream.Stream;

/**
 * Given an array consisting of only 0s, 1s, and 2s.
 * Write a program to in-place sort the array without using inbuilt sort functions.
 * ( Expected: Single pass-O(N) and constant space)
 *
 *
 */
public class SortAnArrayOf0s1sand2s {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        sortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void sortArr(int[] arr) {
       int low = 0, mid = 0;
       int high = arr.length - 1;
       while (mid <= high) {
           if (arr[mid] == 0){
               int temp = arr[low];
               arr[low] = arr[mid];
               arr[mid] = temp;
               mid++;
               low++;
           }
           else if (arr[mid] == 1){
               mid++;
           }
           else if (arr[mid] == 2){
               int temp = arr[mid];
               arr[mid] = arr[high];
               arr[high] = temp;
               high--;
           }
       }
    }
}
