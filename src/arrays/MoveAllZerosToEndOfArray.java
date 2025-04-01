package arrays;

import java.util.ArrayList;


/**
 * Problem Statement: You are given an array of integers,
 * your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
 */
public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = arr.length;
        //ArrayList<Integer> result = moveZeroBruteForce(arr,n);
        //System.out.println(result);
        int result[] = moveZero(arr, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] moveZero(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j+1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static ArrayList<Integer> moveZeroBruteForce(int[] arr, int n) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                tempArray.add(arr[i]);
            }
            else
                countZero++;
        }
        for (int i = 0; i < countZero; i++) {
            tempArray.add(0);
        }
        return tempArray;
    }

}
