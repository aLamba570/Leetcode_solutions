//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    static final int MOD = 1000000007;
    static int[][] memo;

    static int nCr(int n, int r) {
        memo = new int[n + 1][r + 1];
        return calculateNCr(n, r);
    }

    static int calculateNCr(int n, int r) {
        if (n < r)
            return 0;
        if (r == 0 || n == r)
            return 1;
        if (r == 1)
            return n;

        if (memo[n][r] != 0)
            return memo[n][r];

        memo[n][r] = (calculateNCr(n - 1, r - 1) + calculateNCr(n - 1, r)) % MOD;
        return memo[n][r];
    }
}
