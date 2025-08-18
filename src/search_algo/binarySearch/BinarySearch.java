package search_algo.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,4,6,7,8,9};
        //int[] arr = {};
        int target = 4;
        //binarySearch(arr, target);
        //binarySearch(arr, target, false);
//        int[] ans = searchRange(arr, target);
//        System.out.println("First: " + ans[0] + " ,Last: " + ans[1]);
//        System.out.println(ans[1]-ans[0]+1);
        System.out.println(binarySearchFloor(arr,4));
        System.out.println(binarySearchCeil(arr, 4));
    }
    static void binarySearch(int[] arr, int target) {
        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid]<target) {
                start  = mid+1;
            }
            else end = mid-1;
        }
        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println(target + " present at index: " +ans);
    }

    static int binarySearch(int[] arr, int target, boolean isFirst) {
        int start = 0; int end  = arr.length-1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst){
                    end = mid-1;
                }
                else start = mid+1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);
        return res;
    }

    static int binarySearchFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
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

    static int binarySearchCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > target) {
                ans = arr[mid];
                end = mid - 1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}
