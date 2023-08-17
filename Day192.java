
class Day192 {
    public static void main(String[] args) {

        //  You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end.You can advance AT MOST, the number of steps that you're currently on. Determine whether you can get to the end of the array.

        // For example, given the array [1, 3, 1, 2, 0, 1], we can go from indices 0 -> 1 -> 3 -> 5, so return true.
        // Given the array [1, 2, 1, 0, 0], we can't reach the end, so return false.
        int[] arr = {1, 2, 1, 2, 0, 1};
        // int[] arr = {1, 2, 1, 0, 0};
        System.out.println(MySolution(arr));
    }

    public static boolean MySolution(int[] arr) {
        int n = arr.length;
        int maxReach = 0;

        for (int i = 0; i <= maxReach; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);
            if (maxReach >= n - 1) {
                return true;
            }
        }

        return false;
    }
}
