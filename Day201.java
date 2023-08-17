public class Day201 {
    public static void main(String[] args) {
        int[][] arr= {
            {1},
            {2, 3},
            {1, 5, 1}
        };

        int result = arr[0][0], j= 0, temp=0;

        for(int i=1; i<arr.length; i++) {
            if(arr[i][j] > arr[i][j+1]) {
                temp = arr[i][j];
            } else {
                temp = arr[i][j+1];
                j++;
            }
            result += temp;        
        }

        System.out.println("The Cost of the maximum path is : "+result);
    }
}


// public class Solution {

//     public static void main(String... args) {
//         System.out.println(findMaxWeightPath(new int[][] { { 1 }, { 2, 3 }, { 1, 5, 1 } })); // 9
//     }

//     public static int findMaxWeightPath(int[][] arr) {
//         int res = 0;

//         for (int row = 0; row < arr.length; row++) {
//             for (int col = 0; col < arr[row].length; col++) {
//                 arr[row][col] += Math.max(left(arr, row, col), right(arr, row, col));
//                 res = Math.max(res, arr[row][col]);
//             }
//         }

//         return res;
//     }

//     private static int left(int[][] arr, int row, int col) {
//         return row == 0 || col == 0 ? 0 : arr[row - 1][col - 1];
//     }

//     private static int right(int[][] arr, int row, int col) {
//         return row == 0 || col == arr[row].length - 1 ? 0 : arr[row - 1][col];
//     }

// }