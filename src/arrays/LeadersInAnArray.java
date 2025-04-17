package arrays;

/**
 * Given an array, print all the elements which are leaders.
 * A Leader is an element that is greater than all of the elements on its right side in the array.
 *
 * arr = [4, 7, 1, 0]
 * Output: 7 1 0
 */
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        //findLeader(arr);
        findLeaderOptimized(arr);
    }

    // O(n^2) time complexity
    private static void findLeader(int[] arr) {
        int n = arr.length;
        int i,j;
        for (i=0; i<n; i++) {
            for (j=i+1; j<n; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }

            }
            if (j == n) {
                System.out.println(arr[i]);
            }
        }
    }

    //{10, 22, 12, 3, 0, 6}
    public static void findLeaderOptimized(int[] arr) {
        int n = arr.length;
        int maxArr = arr[n-1];
        System.out.println(maxArr);
        for (int i=n-2; i>=0; i--) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
                System.out.println(maxArr);
            }
        }
    }
}
