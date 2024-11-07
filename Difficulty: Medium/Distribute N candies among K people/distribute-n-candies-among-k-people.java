//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            Long[] res = ob.distributeCandies(N,K);
            
            for(int i=0; i<K; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long[] distributeCandies(int n, int k) {
        // code here
        Long[] res = new Long[k];
        Arrays.fill(res, 0L);
        int candiesLeft = n;
        int turn = 0;
        int candies = 1;
        
        while(candiesLeft>0){
            for(int i = 0; i<k; i++){
                if(candiesLeft>=candies){
                    res[i] += candies;
                    candiesLeft-=candies;
                }
                else{
                    res[i] +=candiesLeft;
                    candiesLeft = 0;
                    break;
                }
                candies++;
            }
        }
        return res;
    }
};