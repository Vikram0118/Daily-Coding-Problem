// google --- largest elemnet in the defined length of subset

import java.util.Scanner;
class Day18Hard{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {10, 5, 2, 7, 8, 7};
        int pre = Integer.MIN_VALUE;
        System.out.println("ENTER THE VALUE : ");
        int key = input.nextInt();

        int j = key, k=0;

            for(int i=k; i<j; i++) {
                if(j<=a.length){
                    System.out.print(a[i]+" ");
                    if(a[i] > pre) {
                        pre = a[i];
                    }
                    if(i == j-1 && j<=a.length){
                        k++;
                        i=k-1;
                        j++;
                        System.out.println();
                        System.out.println(pre);
                        pre = Integer.MIN_VALUE;
                    }
            }
            }
        input.close();
    }
}