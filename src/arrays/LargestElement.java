package arrays;

/**
 * Problem Statement: Given an array, we have to find the largest element in the array.
 */
public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        findLargest(arr);
    }

    private static void findLargest(int[] arr) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        System.out.println("Largest element is " + large);
    }
}
