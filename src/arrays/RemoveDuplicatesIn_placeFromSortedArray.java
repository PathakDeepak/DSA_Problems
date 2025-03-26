package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 *
 * Note: Return k after placing the final result in the first k slots of the array.
 *
 * Example 1:
 * Input:
 *  arr[1,1,2,2,2,3,3]
 *
 * Output:
 *  arr[1,2,3,_,_,_,_]
 *
 * Explanation:
 *  Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
 */
public class RemoveDuplicatesIn_placeFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        //int k = removeDuplicatesBruteForce(arr);
        int k = removeDuplicatesOptimalApproach(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     *Set insertion takes O(N*logN) + we have to put N values again to array.
     * So total = O(N*logN+N) time complexity
     * And O(N) Space Complexity
     */
    private static int removeDuplicatesBruteForce(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int  k = set.size();
        int j = 0;
        for(int x: set){
            arr[j++] = x;
        }

        return k;
    }

    /**
     * Here 2 pointer Approach. One at index 1st 'i' since its unique and other 'j' iterate loop,
     * and only put to arr[i] position if arr[i]!=arr[j]
     *
     * Here Time complexity is O(N), since only one iteration
     * and O(1) Space complexity since no other space in used.
     */
    static int removeDuplicatesOptimalApproach(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
