public class Day221 {
    public static int findNthSevenishNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n should be a positive integer.");
        }

        // Initialize variables
        int powerOfSeven = 1;
        int sevenishNumber = 0;

        // Use a binary representation of n to determine which powers of 7 to add
        while (n > 0) {
            if ((n & 1) == 1) {
                sevenishNumber += powerOfSeven;
            }
            powerOfSeven *= 7;
            n >>= 1; // Right shift to get the next bit
        }

        return sevenishNumber;
    }

    public static void main(String[] args) {
        int n = 6; // Change this value to find the nth sevenish number
        int result = findNthSevenishNumber(n);
        System.out.println("The " + n + "th sevenish number is: " + result);
    }
}
