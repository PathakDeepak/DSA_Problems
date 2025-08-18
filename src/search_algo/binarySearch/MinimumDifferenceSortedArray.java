package search_algo.binarySearch;

public class MinimumDifferenceSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,12,13,17,19};
        int target = 20;
        int res = minimumDiff(arr, target);
        System.out.println(res);
    }

    private static int minimumDiff(int[] arr, int target) {
        int floor = findFloor(arr, target);
        int ceil = findCeil(arr, target);
        boolean targetExist = searchTarget(arr, target);
        if (targetExist){
            return 0;
        }
        return Math.min(Math.abs(target-floor), Math.abs(ceil-target));
    }

    private static int findCeil(int[] arr, int target) {
        int ans = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }

    private static boolean searchTarget(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target)
                ans = mid;
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else end = mid-1;
        }
        return (ans == target);
    }

    private static int findFloor(int[] arr, int target) {
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {
                ans = arr[mid];
                start = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }

}
