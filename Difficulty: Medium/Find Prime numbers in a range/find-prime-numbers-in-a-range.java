//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int a, int b) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int val = 0;
        for(int i =a; i<=b; i++){
            count = 0;
            for(int j = 2; j<=(int)Math.sqrt(i); j++){
                if(i%j == 0){
                    count++;
                    
                    if(count>0){
                        break;
                    }
                }
            }
            
            if(count == 0 && i !=1){
                list.add(i);
            }
        }
        return list;
    }
    
}