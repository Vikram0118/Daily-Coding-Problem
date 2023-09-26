// minimum number of steps to jump

public class Day245 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 0, 5, 1, 1, 4, 2, 9};
        int n = arr.length;
        System.out.println("The minimum number of jumos you must take in order to get from the start to end : "+recursiveSolution(arr, n, 0, 0, 0));
    }

    public static int recursiveSolution(int[] arr, int n, int index, int jumps, int ans) {
        if(index >= n) {
            return ans = Math.min(ans, jumps);
        }

        ans = recursiveSolution(arr, n, arr[index], jumps + 1, ans);
        if(index > 0) {
            ans = recursiveSolution(arr, n, arr[index], jumps + 1, ans);
            ans = recursiveSolution(arr, n, arr[index] + 1, jumps, ans);
        }
        return ans;

    }
}
