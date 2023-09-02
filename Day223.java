class Day223 {
    public static void main(String[] args) {
        Node root = new Node();

        root = CreateNode(1);
        root.left = CreateNode(2);
        root.right = CreateNode(3);
        root.left.left = CreateNode(4);
        root.left.right = CreateNode(5);
        root.right.left = CreateNode(6);
        root.right.right = CreateNode(7);

        InOrderTraversalRecursion(root);
        System.out.println();
        InOrderTraversalMories(root);
    }

    //Mooris O(1) space
    public static void InOrderTraversalMories(Node root) {
        if(root == null) {
            return ;
        }
        Node current, pre;
        current = root;
        while(current != null) {
            if(current.left == null) {
                System.out.print(current.i+" ");
                current = current.right;
            } else {
                pre = current.left;
                while(pre.right != null && pre.right != current) 
                    pre = pre.right;
                if(pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    pre.right = null;
                    System.out.print(current.i+" ");
                    current = current.right;
                }
            }
        }
    }

    // recursion - only recursive space
    public static void InOrderTraversalRecursion(Node root) {
        if(root == null) {
            return;
        }
        InOrderTraversalRecursion(root.left);
        System.out.print(root.i+" ");
        InOrderTraversalRecursion(root.right);
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