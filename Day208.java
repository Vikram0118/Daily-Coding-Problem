class Day208 {
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        Node root = null;
        root = L.Insert(5, root);
        root = L.Insert(1, root);
        root = L.Insert(8, root);
        root = L.Insert(0, root);
        root = L.Insert(3, root);
        root = L.Insert(10, root);

        // input : 5 1 8 0 3
        // output : 1 0 5 8 3


        L.PrintLinkedList(root);
        System.out.println();
        MySolution(root, 5);
        L.PrintLinkedList(root);
    }

    public static Node MySolution(Node root, int k) {
        Node node = root;
        Node end = root;
        while(end.next != null) {
            end = end.next;
        }
        while(node.next != null) {
            if(node.i > k ) {
                Node tempNode = node.next;
                while(tempNode != null && tempNode.i != 3) {
                    if(tempNode.i < node.i) { 
                        int tempInt = node.i;
                        node.i = tempNode.i;
                        tempNode.i = tempInt;
                        break;
                    }
                    tempNode = tempNode.next;
                }
                node = node.next;
            } else if(node.i == k) {
                // Node tempEnd = new Node();
                // if(end.i == k) {
                //     tempEnd = node;
                //     while(tempEnd.next != end) {
                //         tempEnd = tempEnd.next;
                //     }
                //     end = tempEnd;
                // }
                // if(end.i != k) {
                //     int tempInt = node.i;
                //     node.i = end.i;
                //     end.i = tempInt;
                //     tempEnd = node;
                //     while(tempEnd.next != end) {
                //         tempEnd = tempEnd.next;
                //     }
                //     end = tempEnd;
                // }
                node = node.next;
            } else {
                node = node.next;
            }
        }
        return root;
    }
}

class Node {
    int i;
    Node next;
}

class LinkedList {
    public Node Insert(int val, Node node) {
        if(node == null){
            return NewNode(val);
        } else {
            node.next = Insert(val, node.next); // using recursion
        }
        return node;
    }

    private Node NewNode(int val) {
        Node n = new Node();
        n.i = val;
        n.next = null;
        return n;
    }

    public void PrintLinkedList(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.i+" ");
        PrintLinkedList(node.next);
    }
}