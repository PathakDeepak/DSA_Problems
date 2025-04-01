package arrays;


import java.util.ArrayList;

/**
 * Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
 *
 * The union of two arrays can be defined as the common and distinct elements in the two arrays.
 * NOTE: Elements in the union should be in ascending order.
 *
 * Example 1:
 * Input:
 *n = 5,m = 5.
 * arr1[] = {1,2,3,4,5}
 * arr2[] = {2,3,4,4,5}
 *
 *  Output:
 *  {1,2,3,4,5}
 */
public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> union = findUnion(arr1, arr2, n, m);
        System.out.println(union);
    }

    private static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || checkLastIfSame(union, arr1, i)) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if (union.size() == 0 || checkLastIfSame(union, arr2, j)) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (checkLastIfSame(union, arr1, i))
                union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (checkLastIfSame(union, arr2, j))
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
    private static boolean checkLastIfSame(ArrayList<Integer> union, int[] arr, int current) {
        return union.get(union.size() - 1) != arr[current];
    }
}
