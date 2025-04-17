package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
 * Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
 */
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        List<Integer> result = reArrangeElements(arr);
        System.out.println(result);
    }

    private static List<Integer> reArrangeElements(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(arr.length, 0));
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                list.set(posIndex, arr[i]);
                posIndex += 2;
            }
            else {
                list.set(negIndex, arr[i]);
                negIndex += 2;
            }
        }
        return list;
    }
}
