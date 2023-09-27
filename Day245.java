// minimum number of steps to jump

// not the most optimal though :( !

import java.util.*;

public class Day245 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 0, 5, 1, 1, 4, 2, 9};
        int n = arr.length;
        System.out.println("The minimum number of jumos you must take in order to get from the start to end : "+Solution(arr, n));
    }

    public static int Solution(int[] arr, int n) {
        int[] DP = new int[n];
        Arrays.fill(DP, Integer.MAX_VALUE);
        DP[0] = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; (j<=arr[i] + i) && j<n; j++) {
                DP[j] = Math.min(DP[i] + 1, DP[j]);
                // System.out.print(DP[j]+" ");
            }
            // System.out.println();
        }

        return DP[n-1];
    }
}
