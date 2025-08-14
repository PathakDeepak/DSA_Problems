package sliding_window;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{12, -1, -7, 8, -15, 30, 16, 28} ;
        int window = 3;
        //findNegativeBruteForce(nums, window);
        Arrays.stream(findNegativeOpt(nums, window)).forEach(System.out::println);

    }

    private static void findNegativeBruteForce(int[] nums, int window) {

    }

    private static int[] findNegativeOpt(int[] nums, int window) {
        int length  = nums.length;
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        while (index < window) {
            if (nums[index] < 0) {
                queue.offer(nums[index]);
            }
            index++;
        }
        int[] result = new int[length-window+1];
        result[0] = queue.isEmpty()?0:queue.peek();

        for (int i = 1; i < length-window+1; i++) {
            //remove
            if (nums[i-1] < 0) {
                queue.poll();
            }
            //add
            if (nums[i+window-1] < 0) {
                queue.offer(nums[i+window-1]);
            }
            result[i] = queue.isEmpty()?0:queue.peek();
        }
        return result;
    }
}
