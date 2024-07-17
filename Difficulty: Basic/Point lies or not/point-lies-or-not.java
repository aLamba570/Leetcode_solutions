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
            String S[] = read.readLine().split(" ");
            String S1[] = read.readLine().split(" ");
            
            int x1 = Integer.parseInt(S[0]);
            int y1 = Integer.parseInt(S[1]);
            int x2 = Integer.parseInt(S[2]);
            int y2 = Integer.parseInt(S[3]);
            int x3 = Integer.parseInt(S[4]);
            int y3 = Integer.parseInt(S[5]);
            
            int x = Integer.parseInt(S1[0]);
            int y = Integer.parseInt(S1[1]);

            Solution ob = new Solution();
            System.out.println(ob.isInsideTri(x1,y1,x2,y2,x3,y3,x,y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String isInsideTri(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
        // code here
        double A = area(x1, y1, x2, y2, x3, y3);
        double A1 = area(x1, y1, x2, y2, x, y);
        double A2 = area(x1, y1, x, y, x3, y3);
        double A3 = area(x, y, x2, y2, x3, y3);
        
        if(A == A1+A2+A3){
            return "Yes";
        }
        return "No";
        
    }
    
    
    public static double area(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2))/2.0);
    }
};