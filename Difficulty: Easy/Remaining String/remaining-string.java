//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int c = 0;
        String res = "";
        int n = s.length();
        int index = -1;
        
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == ch){
                c++;
            }
            
            if(c == count){
                index = i;
                break;
            }
        }
        
        if(index != -1 && index<n-1){
            res = s.substring(index+1);
        }
        return res;
    }
}