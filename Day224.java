// find the smallest number that is not a sum of subset of an array

import java.util.ArrayList;
import java.util.List;

class Day224 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10};
        int n = arr.length ;

        // worst method i can think of
        List<Integer> ans = new ArrayList<>();
        ans = RecursionSolution(arr, n, 0, 0, ans); 
        for(int i=1; i<ans.get(ans.size() -2); i++) {
            if(!ans.contains(i)) {
                System.out.println("The smallest element that is not a sum of subset of the array : "+i);
                break;
            } 
        }

        // time - O(n) 
        int result =1;
        for(int i =0; i<arr.length; i++) {
            if(arr[i]<=result) {
                result += arr[i];
            } else  {
                System.out.println("The smallest element that is not a sum of subset of the array : "+(result));
                break;
            }
        }
    }

    public static List<Integer> RecursionSolution(int[] arr, int n, int index, int subsetsum, List<Integer> ans) {
        if(index == n) {
            ans.add(subsetsum);
            return ans;
        }
        ans = RecursionSolution(arr, n, index + 1, (subsetsum + arr[index]), ans);
        ans = RecursionSolution(arr, n, index + 1, subsetsum, ans);
        return ans;
    }
}