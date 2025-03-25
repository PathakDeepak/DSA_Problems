package arrays;

/**
 * Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
 * If the array is sorted then return True, Else return False.
 */
public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        //int arr[] = {4,4,4,4,4,4};
        int n = arr.length;
        boolean status = checkArray(arr, n);
        System.out.println("Array is sorted: " + status);
    }

    private static boolean checkArray(int[] arr, int n) {
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= smallest) {
                smallest = arr[i];
            }
            else
                return false;

        }
        return true;
    }
}
