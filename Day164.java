public class Day164 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 4, 5, 6, 7, 8 };

        System.out.println(UsingCyclicSort(arr, arr.length));
        printArray(arr);
    }

    public static int UsingCyclicSort(int[] arr, int n) {

        int i=0;
        while(i<arr.length) {
            if(arr[i] == i+1 || arr[i] > i+1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
                i++;
            }
        }

        return arr[n-1];
    }

    public static void printArray(int[] arr) {
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
