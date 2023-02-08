import java.util.Scanner;
class Day18Hard{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {10, 5, 2, 7, 8, 7};
        int pre = Integer.MIN_VALUE;
        System.out.println("ENTER THE VALUE : ");
        int key = input.nextInt();

        int j = key, k=0;

        // while(i<j) {
            for(int i=k; i<j; i++) {
                System.out.print(a[i]+" ");
                if(a[i] > pre) {
                    pre = a[i];
                }
                // if(i==j-1){
                //     k; 
                //     j=
                // }
            }
        // }

        input.close();
    }
}