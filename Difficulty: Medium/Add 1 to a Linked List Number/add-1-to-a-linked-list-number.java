//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // If the head is null, return null
        if (head == null) {
            return null;
        }

        // Step 1: Find the length of the linked list
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Step 2: Store the values of the linked list into an array
        int[] arr = new int[n];
        temp = head;
        for (int i = 0; i < n; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }

        // Step 3: Add 1 to the last digit and handle the carry
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
            }
        }

        // Step 4: If the first digit became zero, we need to add a new node with 1 at the front
        Node dummy = new Node(0);  // Create a dummy node
        Node curr = dummy;

        // Step 5: Reconstruct the linked list
        if (arr[0] == 0) {  // We had a carry and need to add a new node with value 1
            curr.next = new Node(1);
            curr = curr.next;
        }
        
        // Add the remaining elements
        for (int i = 0; i < n; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

        // Return the correct head (skip the dummy node)
        return dummy.next != null ? dummy.next : head;
    }
}
