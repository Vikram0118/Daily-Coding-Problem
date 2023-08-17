class Node {
    int data;
    Node left ;
    Node right;
}

public class Day204 extends Node {
    
    public static void main(String[] args) {

        Node root = CreateBinaryTree(1);

        root.left = CreateBinaryTree(2);
        root.right = CreateBinaryTree(3);

        root.left.left = CreateBinaryTree(4);
        root.left.right = CreateBinaryTree(5);
        root.right.left = CreateBinaryTree(6);
        root.right.right = CreateBinaryTree(7);

        root.left.left.left = CreateBinaryTree(8);
        root.left.left.right = CreateBinaryTree(9);
        root.left.right.right = CreateBinaryTree(10);

        //                 1
        //           2           3
        //        4     5      6     7
        //     8     9    10
        System.out.println("Number of nodes : "+MySolution(root));
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.left = null;
        A.right = null; 
        return A;
    }

    public static int MySolution(Node node) {
        // just the number of nodes - i m just doing what ever way comes to my mind to find number of nodes
        if(node == null) {
            return 0;
        }
        return MySolution(node.left) + MySolution(node.right) + 1;
    }
}

