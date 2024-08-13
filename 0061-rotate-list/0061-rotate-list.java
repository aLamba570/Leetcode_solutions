/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        int n = 0;
        ListNode curr = head;

        while(curr != null){
            n++;
            curr = curr.next;
        }

        int[] arr = new int[n];
        curr = head;

        for(int i = 0; i<n; i++){
            arr[i] = curr.val;
            curr = curr.next;
        }

        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        ListNode nh = new ListNode(arr[0]);
        ListNode nc = nh;

        for(int i = 1; i<n; i++){
            nc.next = new ListNode(arr[i]);
            nc = nc.next;
        }

        return nh;
    }

    public void reverse(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}