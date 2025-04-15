package arrays;

/**
 * Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
 * You may consider that such an element always exists in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
       int result = findMajorityElement(arr);
        System.out.println(result);

    }

    private static int findMajorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                candidate = arr[i];
            } else if (arr[i] == candidate) {
                count++;
            }
            else count--;
        }
        return candidate;
    }
}
