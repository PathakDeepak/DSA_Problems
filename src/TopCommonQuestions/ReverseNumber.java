package TopCommonQuestions;

import java.util.Scanner;

/**
 * To reverse a number, you need to take the digits of the number and rearrange them in the opposite order.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);

        //input from user
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.print("Reverse of " + number + " is ");

        StringBuilder s = new StringBuilder();
        while (number != 0)
        {
            int pick_last = number % 10;

            //use function to convert pick_last from integer to string
            s.append(pick_last);
            number = number / 10;
        }

        //display the reversed number
        System.out.println(s); // It's of String datatype
        System.out.println("Integer form: " + Integer.parseInt(s.toString()));

        //closing scanner class(not compulsory, but good practice)

        sc.close();
    }
}
