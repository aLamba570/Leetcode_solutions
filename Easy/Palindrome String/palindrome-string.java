//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        char[] arr = S.toCharArray();
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            if (arr[start] != arr[end]) {
                return 0; // Not a palindrome
            }
            start++;
            end--;
        }
        return 1; // It's a palindrome
    }
}
