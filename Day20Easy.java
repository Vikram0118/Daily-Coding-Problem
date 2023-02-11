// google

class Node {
    int data;
    Node next;

    Node(int d ){
        data = d;
        next = null;
    }
}

class Linked {
    public Node insertNode(int data, Node root) {
        if(root == null) {
            return createNode(data);
        } else {
            Node firstNode = root;
            Node temp = createNode(data);
            while(root.next != null){
                root = root.next;
            }
            root.next = temp;
            temp.next = null;
            return firstNode;
        }
    }

    private Node createNode(int data) {
        Node a = new Node(data);
        return a;
    }

    public void printList(Node root) {
        while(root != null) {
            System.out.print(root.data+" ");
            root = root.next;
        }
    }

    public int intersectNode(Node root1, Node root2) {

        while(root1!=null && root2!=null){
            if(root1.data == root2.data) {
                return root1.data;
            } else {
                root1 = root1.next;
                root2 = root2.next;
            }
        }

        return -999;
    }
}

public class Day20Easy {
    public static void main(String[] args) {
        Node root1  = null;
        Node root2  = null;
        Linked linked = new Linked();

        root1 = linked.insertNode(3, root1);
        root1 = linked.insertNode(7, root1);
        root1 = linked.insertNode(8, root1);
        root1 = linked.insertNode(10, root1);

        root2 = linked.insertNode(99, root2);
        root2 = linked.insertNode(1, root2);
        root2 = linked.insertNode(8, root2);
        root2 = linked.insertNode(10, root2);

        System.out.println("LIST 1 : ");
        linked.printList(root1);
        System.out.println();
        System.out.println("LIST 2 : ");
        linked.printList(root2);
        System.out.println();
        System.out.println( ((linked.intersectNode(root1, root2)) == -999) ? "THERE IS NO INTERSECTING NODE" : "THE INTERSECTING NODE IS "+(linked.intersectNode(root1, root2)) );
    }
}
