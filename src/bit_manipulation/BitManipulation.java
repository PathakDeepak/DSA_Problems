package bit_manipulation;

public class BitManipulation {

    public static void main(String[] args) {
        int num = 467;
        int bitSize = 32;
        printBits(bitSize,num);
        //System.out.println();
        //isEvenOrOdd(num);
        //System.out.println(isPowerOfTwo(num));
        //printBits(bitSize, num);
        //printBits(bitSize, unSetBit(num, 5));
        //printBits(bitSize, toggleIthBit(num, 4));
        //printBits(bitSize, unSetRightmostBit(num));
        findCountOfSetBit(num);
    }

    private static boolean isBitSet(int num, int bit) {
        return (1<<bit & num) !=0;
    }

    private static void isEvenOrOdd(int num) {
        if (isBitSet(num, 0))
            System.out.println("odd");
        else System.out.println("even");
    }

    private static void printBits(int bitSize, int num) {
        for (int i = bitSize-1; i >=0; i--) {
            System.out.print(num>>i & 1);
        }
        System.out.println();
    }

    private static boolean isPowerOfTwo(int num) {
        int decNum = num-1;
        return (num & decNum) == 0 ;
    }

    private static int unSetBit(int num, int bit) {
        return num & ~(1<<bit);
    }

    private static int toggleIthBit(int num, int bit) {
        return num ^ (1<<bit);
    }

    private static int unSetRightmostBit(int num) {
        return num & num-1;
    }
    private static void findCountOfSetBit(int num) {
        int count = 0;
        while (num != 0) {
            num = num & num-1;
            count++;
        }
        System.out.println("no. of set bits: " + count);
    }
}
