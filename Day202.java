public class Day202 {
    public static void main(String[] args) {
        // check if the given number is palindrome without using string 

        int n = 62926;
        System.out.println(UsingModuloOperator(n));
    }

    public static boolean UsingModuloOperator(int n) {
        int temp = 0, N = n, ReverseNum = 0;

        while(N > 0) {
            temp = N % 10;
            ReverseNum = (ReverseNum * 10) + temp;
            N = N/10;
        }

        return (n == ReverseNum) ? true : false;
    }
}
