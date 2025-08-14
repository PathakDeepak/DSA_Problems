package search_algo;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Input: arr = [2,1]
 * Output: false
 * Input: arr = [0,3,2,1]
 * Output: true
 */
public class MountainArray {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2, 1}));          // false
        System.out.println(validMountainArray(new int[]{3, 5, 5}));       // false
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
    }
    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (arr.length < 3) return false;
        int i = 0;

        //walk up
        while(i < len-1 && arr[i] < arr[i+1]){
            i++;
        }
        if (i == 0 || i == len-1) return false;

        //walk down
        while(i < len-1 && arr[i] > arr[i+1]) i++;

        return i == len-1;
    }
}
