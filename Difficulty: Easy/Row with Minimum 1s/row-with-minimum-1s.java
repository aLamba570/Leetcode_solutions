//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int M = Integer.parseInt(read.readLine());
            int mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(mat));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minRow(int mat[][]) {
        // code here
        int res = -1;
        int minone = Integer.MAX_VALUE;
        
        for(int i = 0; i<mat.length; i++){
            int one = 0;
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    one++;
                }
            }
            
            if(one < minone){
                minone = one;
                res = i+1;
            }
        }
        return res;
    }
};