package search_algo.binarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int hours = 8;

        int res = minEatingSpeed(piles, hours);
        System.out.println(res);
    }

    private static int minEatingSpeed(int[] piles, int hours) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }
        int res = 0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (abc(piles, mid, hours)){
                res = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return res;
    }

    private static boolean abc(int[] piles, int eatingSpeed, int hours) {
        int currentHour = 0;

        for (int i = 0; i < piles.length; i++) {
            currentHour += piles[i]/eatingSpeed;
            if (piles[i] % eatingSpeed !=0)
                currentHour += 1;
            if (currentHour > hours) return false;
        }

        return true;
    }
}
