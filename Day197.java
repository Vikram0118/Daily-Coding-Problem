
class Day197 {
    public static void main(String[] args) {
        // given an array and a number k, rotate the array right for the k position in place  
        // asked in Amazon
        // input - 1, 2, 3, 4, 5
        // output - 4, 5, 1, 2, 3

        int[] arr = {1, 2, 3, 4, 5};

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        arr = MySolution(arr, 2);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] MySolution(int[] arr, int k) {

        for(int i=0; i<k; i++) {
            int temp = arr[arr.length -1]; // taking the last varible
            // System.out.println(temp);
            for(int j=arr.length-1; j>0; j--) {
                arr[j] = arr[j-1];          // shifting all the elements in place to right
            }
            arr[0] = temp;
        }

        return arr;
    }


    // using revese
    public static void rotateRight(int[] arr, int k) {
        k %= arr.length;

        reverse(arr, 0, arr.length - 1);  // 5, 4, 3, 2, 1
        reverse(arr, 0, k - 1);           // 4, 5, 3, 2, 1
        reverse(arr, k, arr.length - 1);    // 4, 5, 1, 2, 3
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r)
            swap(arr, l++, r--);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}