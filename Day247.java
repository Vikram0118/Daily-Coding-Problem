// check for height balanced binary tree

public class Day247 {
    public static void main(String[] args) {
        Node root = new Node();

        root = CreateNode(1);

        root.left = CreateNode(2);
        root.right = CreateNode(3);

        root.left.left = CreateNode(4);
        root.left.right = CreateNode(5);
        root.right.left = CreateNode(6);
        root.right.right = CreateNode(7);

        root.right.right.right = CreateNode(8);

        // root.right.right.right.right = CreateNode(9);

        System.out.println((CheckForHeightBalanced(root) != -1) ? "Height Balanced" : "Not Height Balanced");
    }

    public static int CheckForHeightBalanced(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int left = CheckForHeightBalanced(root.left);
        int right = CheckForHeightBalanced(root.right);

        if(left == -1 || right == -1) {
            return -1;
        }

        if(Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public static Node CreateNode(int i){
        Node root = new Node();
        root.i = i;
        root.left = null;
        root.right = null;
        return root;
    }
}

class Node {
    int i;
    Node left;
    Node right;
}