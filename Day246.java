
import java.util.*;

public class Day246 {

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        Node root = null;
        root = L.Insert("chair", root);  // true
        root = L.Insert("height", root);
        root = L.Insert("racket", root);
        root = L.Insert("touch", root);
        root = L.Insert("tunic", root);

        // root = L.Insert("aaa", root);  // false
        // root = L.Insert("bbb", root);
        
        System.out.println(L.Solution(root));
    }
    
}

class LinkedList {

         
    // Return true if an order among strings is possible   
    public boolean Solution(Node root) {
        int m = 26;
        Node refHead = root;
        boolean mark[] = new boolean[m];
        int in[] = new int[26];
        int out[] = new int[26];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < m; i++)
            adj.add(new ArrayList<>());

        // Process all strings one by one
        while(root != null) {

            // Find first and last characters
            int f = (int)(root.data.charAt(0) - 'a');
            int l = (int)(root.data.charAt(root.data.length() - 1) - 'a');

            // Mark the characters
            mark[f] = mark[l] = true;

            // Increase indegree and outdegree count
            in[l]++;
            out[f]++;

            // Add an edge in graph
            adj.get(f).add(l);

            root = root.next;
        }

        // If for any character indegree is not equal to
        // outdegree then ordering is not possible
        for(int i = 0; i < m; i++) {  // number of all characters should be the same
            if (in[i] != out[i])
                return false;
        }

        return isConnected(adj, mark, refHead.data.charAt(0) - 'a');
    }
    
    // Returns true if all vertices are strongly
    // connected i.e. can be made as loop
    public static boolean isConnected(ArrayList<ArrayList<Integer>> adj, boolean mark[], int src) {
        boolean visited[] = new boolean[26];

        // Perform a dfs from src
        dfs(adj, visited, src);
        for(int i = 0; i < 26; i++) {
        
            /*  I character is marked (i.e. it was first or
             last character of some string) then it should
             be visited in last dfs (as for looping, graph
             should be strongly connected) */
            if (mark[i] && !visited[i])
                return false;
        }

        // If we reach that means graph is connected
        return true;
    }

    // Utility method for a depth first
    // search among vertices
    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], int src) {
        visited[src] = true;
        for(int i = 0; i < adj.get(src).size(); i++)
            if (!visited[adj.get(src).get(i)])
                dfs(adj, visited, adj.get(src).get(i));
    }

    public Node Insert(String val, Node node) {
        if(node == null){
            return NewNode(val);
        } else {
            node.next = Insert(val, node.next); // using recursion
        }
        return node;
    }

    private Node NewNode(String val) {
        Node n = new Node();
        n.data = val;
        n.next = null;
        return n;
    }

    public void PrintLinkedList(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data+" ");
        PrintLinkedList(node.next);
    }
}

class Node {
    String data;
    Node next = null;
}
