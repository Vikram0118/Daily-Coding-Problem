import java.util.HashMap;
import java.util.Map;

class Day225 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // 5
        // int[] arr = {2, 4, 1, 5, 3};   // 3

        int k = 2;
        int n = arr.length - 1;
        System.out.println("The prisioner have to stand in position no. "+MySolution(arr, k, n)+" to be executed last");
        
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int i= 0;
        for(i=0; i<nums.length; i++) {
            int ref = target - nums[i];
            if(map.containsKey(ref)) {
                j = map.get(ref);
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {i, j};
    }

    public static int MySolution(int[] circleOrder, int k , int n) {
        int executed = 0;
        int i = -1;
        int ref = k;
        while(executed < n) {
            while(ref > 0) {  // to move to the k not executed position 
                i = (i+1) % (n+1);
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