import java.util.*;

public class Day196 {
    public static void main(String... args) {
        Node root = CreateBinaryTree(5);
        root.left = CreateBinaryTree(2);
        root.right = CreateBinaryTree(-5);

        System.out.println(MySolution(root));
    }

    public static int MySolution(Node root) {
        Map<Integer, Integer> M = new HashMap<>();
        SubTreeSum(root, M);

        if (M.isEmpty()) 
            return 0;
        
        int res = M.keySet().iterator().next();


        for (int sum : M.keySet())
            if (M.get(sum) > M.get(res))
                res = sum;

        return res;

    }

    public static int SubTreeSum(Node root, Map<Integer, Integer> M) {
        if(root == null) {
            return 0;
        }

        int sum = root.data + SubTreeSum(root.left, M) + SubTreeSum(root.right, M);

        M.put(sum, M.getOrDefault(M, 0) + 1);

        return sum;
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.left = null;
        A.right = null; 
        return A;
    }
}

class Node {
    int data;
    Node left ;
    Node right;
}
