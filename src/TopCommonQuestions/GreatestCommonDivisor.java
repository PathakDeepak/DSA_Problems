package TopCommonQuestions;

import java.util.Scanner;

/**
 * This problem asks to find the Greatest Common Divisor (GCD) of two given numbers.
 * The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.
 * </p>
 * The Euclidean algorithm is a popular method for efficiently computing the GCD.
 * Example: Find GCD of 36 and 60:
 * The common divisors of 36 and 60 are 1, 2, 3, 4, 6, 9, 12, 18, 36 and 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
 * The largest common divisor is 12.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from the user
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        //input from the user
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int n = 1;
        System.out.print("HCF of " + num1 + " and " + num2 + " is ");
        if (num1 != num2) {
            while (n != 0) {
                //storing remainder
                n = num1 % num2;
                if (n != 0) {
                    num1 = num2;
                    num2 = n;
                }
            }
            //result
            System.out.println(num2);
        } else
            System.out.println("Wrong Input");
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}
