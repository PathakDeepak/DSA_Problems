package basicMath;


/*
*               Input:N = 12345
                Output:5
* */
public class CountDigitsInNumber {
    public static void main(String[] args) {
        int n = 1000;
        countNumbers(n);

        // Here O(1) as simple arithmetic operations in constant time are computed on integers.
        // Plus in done in computation because for power of 10, N integer gives power and 1 before
        // 0's is not counted.
        System.out.println( (int) Math.log10(n)+1);
    }

    /* This takes O(log10N+1)
     * as in while loop we divide N by 10 until it becomes 0 which takes log10N iterations
     *  plus in each iteration we are incrementing the counter, so O(log10N + 1) operations.
     */
    private static void countNumbers(int n) {
        int count = 0;
        while(n != 0) {
            n = n/10;
            count++;
        }
        System.out.println("count based on loop: " + count);
    }
}
