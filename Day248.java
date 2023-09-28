// maximum of two number without using if else , branching or direct comparision

class Day248 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        System.out.println(MethodOne(a, b));
        System.out.println(MethodTwo(a, b));
        System.out.println(MethodThree(a, b));
        System.out.println(MethodFour(a, b));
    }

    static int MethodOne(int a, int b) {
        int diff = a - b;  // calculating the difference
        // int sign = (diff >> 31) & 1; 
        int sign = (diff >> 31) & 0x1; // getting the sign bit - >> 31 is the right shift to the right most bit 
        // sign 0 for (a >= b) and 1 for (a < b)
        return (a - sign*diff);  // if sign is 0 then we simply return a
        // if sign is 1, we have get the second number because that is the maximum - that can be easily done by adding a and diff times sign
    }

    static int MethodTwo(int a, int b) {
        return (a + b) / 2 + Math.abs(a - b) / 2;
    }

    static int MethodThree(int a, int b) {
        return (int)(Math.sqrt( a*a + b*b - 2*a*b ) + a + b) / 2;
    }

    static int MethodFour(int x, int y) {
        return x - ((x - y) & ((x - y) >> (Integer.SIZE * Byte.SIZE - 1)));
    }
}