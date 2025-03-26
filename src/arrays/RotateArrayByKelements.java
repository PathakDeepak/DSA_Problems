package arrays;

/**
 * Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
 */
public class RotateArrayByKelements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;
        String rotation = "left";
        rotateArray(arr, k, rotation);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] arr, int k, String rotation) {
        int n = arr.length;
        if (rotation.equals("right")) {
            /*
                Step 1: Reverse the last k elements of the array
                Step 2: Reverse the first n-k elements of the array.
                Step 3: Reverse the whole array.
             */
            reverseArray(arr, n-k, n-1);
            reverseArray(arr, 0, n-k-1);
            reverseArray(arr, 0, n - 1);
        } else if (rotation.equals("left")) {
            /*
                Step 1: Reverse the first k elements of the array
                Step 2: Reverse the last n-k elements of the array.
                Step 3: Reverse the whole array.
             */
            reverseArray(arr, 0, k-1);
            reverseArray(arr, k, n-1);
            reverseArray(arr, 0, n - 1);
        }

    }
    private static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
