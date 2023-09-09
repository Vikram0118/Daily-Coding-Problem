import java.util.*;

class Day198 {
    public static void main(String[] args) {
        // subsequence - contigious or non-contigious sequence that follows an order
        // power set method - understand that also 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> L = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> returnBucket = new ArrayList<>();
        for(int i=0; i<n ; i++) {
            L.add(input.nextInt());
        }

        returnBucket = GetSubSequence(0, L, temp, n, returnBucket);
        System.out.println(returnBucket);

        input.close();
    }

    public static List<Integer> GetSubSequence(int index, List<Integer> L, List<Integer> bucket, int n, List<Integer> returnBucket) {

        if(index == n) {
            // System.out.println(bucket);
            if(Check_Condition(bucket)) {
                // System.out.println(bucket);
                if(bucket.size() > returnBucket.size()) {
                    // System.out.println(bucket);
                    return new ArrayList<>(bucket); // WHY
                    // return bucket; // WHY NOT ??   // understood
                    // Creating a New Bucket List: In the original code, you were modifying the bucket list directly, and this was causing unintended changes in subsequent iterations of the recursion. When you added an element to the bucket, it remained there for the entire recursion even after the recursive calls returned. This affected the correctness of the algorithm. By creating a new list using new ArrayList<>(bucket) and passing it to subsequent recursive calls, you ensure that each recursive call has its own separate copy of the bucket list.
                }
            }
            return returnBucket;
        }

        bucket.add(L.get(index));
        returnBucket = GetSubSequence(index + 1, L, bucket, n, returnBucket);
        bucket.remove(bucket.size() - 1); 
        //Removing Last Element from Bucket: After exploring one branch of recursion with an element included in the bucket, you need to backtrack and try the other branch without that element. To do this, you should remove the last element from the bucket before trying the other branch. This ensures that the bucket list accurately represents the current state of the subsequence you're constructing during each recursive call.
        returnBucket = GetSubSequence(index + 1, L, bucket, n, returnBucket);

        return returnBucket;
    }

    public static boolean Check_Condition(List<Integer> temp) {
        if(temp.size() < 1) {
            return false;
        }
        for(int i=0; i < temp.size() - 1; i++) {
            if(temp.get(i) % temp.get(i+1) != 0 && temp.get(i+1) % temp.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}
