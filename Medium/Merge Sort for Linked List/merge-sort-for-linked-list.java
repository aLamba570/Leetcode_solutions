//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        if(head == null || head.next==null){
            return head;
        }

        Node middle = findMiddle(head);
        Node nextMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextMiddle);

        return mergeList(left, right);
    }

    private static Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        Node prev = null;

        while(fast!= null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }

    private static Node mergeList(Node left, Node right){
        Node dummy = new Node(-1);
        Node current = dummy;

        while(left != null && right != null){
            if(left.data<right.data){
                current.next = left;
                left = left.next;
            }
            else{
                current.next = right;
                right = right.next;
            }
            current= current.next;
        }

        if(left != null){
            current.next = left;
        }

        if(right!= null){
            current.next = right;
        }
        return dummy.next;
    }
}
