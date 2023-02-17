class Node {
    int data;
    Node next;
}

class Linked {
    public Node insertNode(Node root, int data) {
        Node first = root;
        if(root == null){
            return createNode(data);
        } else {
            while(root.next != null) {
                root = root.next;
            }
            Node temp = createNode(data);
            root.next = temp;
        }
        return first;
    }

    private Node createNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    public void printNode(Node root) {
        while(root != null){
            System.out.print(root.data+" ");
            root = root.next;
        }
    }

    private int lengthOfList(Node root) {
        int count = 0;
        while(root != null) {
            count ++;
            root = root.next;
        }
        return count;
    }

    public Node removeKthFromLast(Node root, int k){
        Node first = root;
        int length = lengthOfList(root);
        int position = length - k;

        while(position > 1){
            root = root.next;
            position --;
        }
        if(position == 0){
            root = root.next;
            return root;
        }else {
            root.next = root.next.next;
        }
        return first;
    }

}

class Day26Medium {
    public static void main(String[] args) {
        Node root = null;
        Linked linked = new Linked();

        root = linked.insertNode(root, 1);
        root = linked.insertNode(root, 2);
        root = linked.insertNode(root, 3);
        root = linked.insertNode(root, 4);
        root = linked.insertNode(root, 5);
        root = linked.insertNode(root, 6);
        root = linked.insertNode(root, 7);

        linked.printNode(root);
        System.out.println();

        root = linked.removeKthFromLast(root, 7);

        linked.printNode(root);
    }
}