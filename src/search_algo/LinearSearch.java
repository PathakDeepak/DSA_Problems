package search_algo;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,6,2,7,8,0};
        int target = 2;
        boolean findLast = true;
        //linearSearchElement(arr, target, findLast);
        //linearSearchMultiple(arr, target);
        findMax(arr);
    }

    private static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.printf("%d is Max", max);
    }

    private static void linearSearchMultiple(int[] arr, int target) {
        int[] ans = new int[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                ans[j] = i;
                j++;
            }
        }
        if (j == 0){
            System.out.println("Element not present");
        }
        else System.out.println(Arrays.toString(ans));
    }

    private static void linearSearchElement(int[] arr, int target, boolean findLast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                if (!findLast)
                    break;
            }
        }
        if (ans == -1) {
            System.out.println("No element found in Array");
        }
        else
            System.out.printf("%d present at index %d", target, ans);
    }



}
