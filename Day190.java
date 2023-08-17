import java.util.*;

public class Day190 {
    public static void main(String[] args) {
        // we have to do this is O(n)
        // int[] arr = {8, -1, 3, 4};  // return 15 (8 + 3 + 4)
        // int[] arr = {-4, 5, 1, 0}; // return 6 (5 + 1)
        int[] arr = {-4, -5, -1}; // return 6 (5 + 1)

        System.out.println(MySolution(arr));
    }

    public static int MySolution(int[] arr) {
        int max = Integer.MIN_VALUE, curr=0;
        List<Integer> S = new ArrayList<>(); 

        for(int i=0; i<arr.length; i++) { 
            if(curr < (curr + arr[i])) {
                S.add(arr[i]);
                curr += arr[i];
            }

            max = Math.max(max, curr);
        }

        if(S.isEmpty()) {
            System.out.println("No Solution");
        }

        for(int i : S) {
            System.out.print(i+" ");
        }
        System.out.println();

        return max;
    }
}
