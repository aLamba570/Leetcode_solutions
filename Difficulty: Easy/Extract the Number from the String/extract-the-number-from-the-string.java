//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        String[] words = sentence.split(" ");
        long result = -1;
        
        for (String word : words) {
            if (isValidNumber(word)) {
                long num = Long.parseLong(word);
                if (num > result) {
                    result = num;
                }
            }
        }
        return result;
    }
    
    private static boolean isValidNumber(String str) {
        if (str.isEmpty()) return false;
        int start = 0;
        if (str.charAt(0) == '-') start = 1; // allow negative numbers
        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '8') return false; // ensure digits are between 0 and 8
        }
        return true;
    }
}
