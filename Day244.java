// sieve Erathosthenes algorithm to generate prime number smaller than N

public class Day244 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = -1;
        
        for(int i=1; i<n; i++) {
            if(arr[i] != -1) {
                for(int j=i+i; j<n; j+=i) {
                    if(arr[j] != -1 && (j+1)%(i+1) == 0) {
                        arr[j] = -1;
                    }
                }
            }
        }

        for(int i=1; i<n; i++) {
            if(arr[i] != -1) {
                System.out.print(i+1 +" ");
            }
        }
    }
}

// public class Day244 {
//     public static void main(String[] args) {
//         int n = 10;
//         boolean[] arr = new boolean[n];
//         for(int i = 2; i < n; i++) {
//             arr[i] = true;
//         }
        
//         for(int i = 2; i * i < n; i++) {
//             if(arr[i]) {
//                 for (int j = i * i; j < n; j += i) {
//                     arr[j] = false;
//                 }
//             }
//         }

//         for(int i = 2; i < n; i++) {
//             if(arr[i]) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }
