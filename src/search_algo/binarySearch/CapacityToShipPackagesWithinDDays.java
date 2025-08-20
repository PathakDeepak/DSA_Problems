package search_algo.binarySearch;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int res = shipWithinDays(weights,days);
        System.out.println(res);
    }

    private static int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }
        int res = 0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (isShipmentPossible(weights, mid, days)) {
                res = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return res;
    }

    private static boolean isShipmentPossible(int[] weights, int maxWeight, int days) {
        int currentDay = 1;
        int weight = 0;
        for (int i = 0; i < weights.length; i++) {
            weight += weights[i];
            if (weight > maxWeight){
                currentDay += 1;
                weight = weights[i];
            }
            if (currentDay > days) return false;
        }
        return true;
    }
}
