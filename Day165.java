public class Day165 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 6, 1};

        int[] ans = new int[arr.length];

        ans = MyFirstSolution(arr);

        for(int i : ans) {
            System.err.print(i+" ");
        }
    }

    public static int[] MyFirstSolution(int[] arr) {
        int i=0;
        int[] ans = new int[arr.length];

        while(i < arr.length -1) {
            int j=i+1;
            int temp = 0;
            while(j < arr.length) {
                if(arr[i] > arr[j]) {
                    temp ++;
                }
                j++;
            }
            ans[i] = temp;
            i++;
        }
        return ans;
    }
}
