import java.util.*;

public class Day186 {
    public static void main(String[] args) {
        
        int[] arr = {3, 1, 4, 2, 2, 1};

        System.out.println("Solution : ");
        System.out.println(Mysolution(arr));
        Set<Set<Integer>> Solution  = Mysolution(arr);

        int[] ans = new int[Solution.size()];
        int i = 0;

        for (Set<Integer> set : Solution) {
            int curr = 0;
            for (int j : set) {
                curr += j;
            }
            ans[i++] = curr;
        }
        
        System.out.println("Differnce : "+Math.abs(ans[0] - ans[1]));

        // System.out.println("Differnece : "+(ans - SetSum(Solution.iterator().next())));
    }

    public static Set<Set<Integer>> Mysolution(int[] arr) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        a.add(arr[i]);
        b.add(arr[j]);
        i++;
        j--;
// 1 1 2 2 3 4
        // {1, 6, 5} {11}

        // 1, 5, 6, 11

        while (i <= j) {
            if(SetSum(a) > SetSum(b)) {
                b.add(arr[i]);
                i++;
            } else if(SetSum(a) < SetSum(b)) {
                a.add(arr[j]);
                j--;
            } else {
                a.add(arr[j]);
                b.add(arr[i]);
                i++;
                j--;
            }
        }

        return new HashSet<>(Arrays.asList(a, b));
    }

    public static int SetSum(Set<Integer> S) {
        int ans =0;
        for(int i : S) {
            ans += i;
        }
        return ans;
    }
}
