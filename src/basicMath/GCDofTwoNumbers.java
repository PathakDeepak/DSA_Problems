package basicMath;


/**
 * The Greatest Common Divisor of any two integers is the largest number that divides both integers.
 */

/*
                Input:N1 = 9, N2 = 12

                Output:3
                Explanation:Factors of 9: 1, 3 and 9
                Factors of 12: 1, 2, 3, 4, 6, 12
                Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
 */
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        int n1 = 17, n2 = 12;
        System.out.println(gcd(n1, n2));
        System.out.println("optimized: " + gcdOptimized(n1, n2));
    }

    // This is better approach as O(min(N1,N2)), but this can be optimized.
    private static int gcd(int n1, int n2) {
        int minOfTwo = Math.min(n1, n2);
        for (int i = minOfTwo; i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    /**
     'The Euclidean Algorithm'
     The Euclidean algorithm is an efficient method for finding the GCD based on the principle that:
                            gcd(a,b)=gcd(b,a mod b)

     This means that the GCD of two numbers a and b is the same as the GCD of b and a mod b. This
     process continues until b=0, at which point a is the GCD.
     */
    static int gcdOptimized(int n1, int n2){
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
