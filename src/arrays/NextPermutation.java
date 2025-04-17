package arrays;

/**
 * Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically
 * next greater permutation of numbers.
 * If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
 *
 * Example 1 :
 * Input format: Arr[] = {1,3,2}
 * Output: Arr[] = {2,1,3}
 * Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
 *
 * Example 2:
 * Input format: Arr[] = {3,2,1}
 * Output: Arr[] = {1,2,3}
 * Explanation: As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the topmost permutation.
 */
public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        findPermutation(arr);
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
    }

    private static void findPermutation(int[] arr) {
        //1. find pivot A[i] < A[i+1]
        int pivot = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, arr.length-1);
            return;
        }

        //2. find rightmost and swap with pivot
        for (int i = arr.length-1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        //3. from pivot+1 element reverse the elements
        reverse(arr, pivot+1, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        int i=start, j=end;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
}
