
class Day225 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {2, 4, 1, 5, 3};

        int k = 2;
        int n = arr.length - 1;
        System.out.println("The prisioner have to stand in position no. "+MySolution(arr, k, n)+" to be executed last");
    }

    public static int MySolution(int[] circleOrder, int k , int n) {
        int executed = 0;
        int i = -1;
        int ref = k;
        while(executed < n) {
            while(ref > 0) {  // to move to the k not executed position 
                i++;
                if(i>n) {
                    i = 0;
                }
                if(circleOrder[i] != -1) {
                    ref --;
                } 
            }
            ref = k;

            if(circleOrder[i] != -1) {  // condition for execution
                circleOrder[i] = -1;  
                System.out.println(i);
                printarray(circleOrder);
                executed++;
            }
        }

        while(circleOrder[i] == -1) {  // to move to the last not executed position 
            i++;
            if(i>n) {
                i = 0;        
            }
        }
        return i + 1;
    }

    public static void printarray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
