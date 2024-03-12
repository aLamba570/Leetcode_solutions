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
            int N = Integer.parseInt(read.readLine());
            int v[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < N; j++) v[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            int ans[][] = ob.sortedMatrix(N, v);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[][] sortedMatrix(int m, int mat[][]) {
        // code here
        
        int n = mat[0].length;
        
        int [] flat = new int[m*n];
        
        int k = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                flat[k++] = mat[i][j];
            }
        }
        
        Arrays.sort(flat);
        
        k = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = flat[k++];
            }
        }
        return mat;
    }
};