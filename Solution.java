import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 4};
        // int[] ans = twoSum(arr, 6);

        // for(int i=0; i<ans.length; i++) {
        //     System.out.print(ans[i]+" ");
        // }

        String s = "abcabcbb";
        // String s = "pwwkew";
        // String s = "bsbbbbb";
        // String s = "tmmzuxt";
        System.out.println(LongestSubStringLengthWithoutRepeatChar(s));
    }

    public static String LongestSubStringLengthWithoutRepeatChar(String s) {
        int start =0; 
        int end =0;
        int resultStart =0;
        int resultEnd =0;
        int n = s.length();
        // StringBuilder Str = new StringBuilder();
        int ans = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        while(end<n) {
            char tempChar = s.charAt(end);
            if(map.containsKey(tempChar)) {
                if(map.get(tempChar) >= start) {
                    start = map.get(tempChar) + 1;
                }
                map.put(tempChar, end);
            } else {
                map.put(tempChar, end);
            }
            if((end - start + 1) > ans) {
                ans = (end - start + 1);
                resultEnd = end;
                resultStart = start;
            }
            end++;
            System.out.println(resultEnd);
        }
        return s.substring(resultStart, resultEnd + 1);
    } 

    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int i =0 ;
        int ans = 0;
        for(i=0; i<n; i++) {
            int ref = target - arr[i];
            ans =  binarySearch(i+1, n, ref, arr);
            if(ans != -1) {
                break;
            }
        }

        return new int[] {i +1, ans +1};
    }

    public static int binarySearch(int start, int end, int k, int[] arr) {

        while(start <= end ) {
            int mid = (end + start) / 2 ;
            if(arr[mid] == k) {
                return mid;
            } else if(arr[mid] > k) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return -1 ;
    }
}