//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int n){
        //code here
        
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int res = energy(n-1, arr, dp);
        return res;
        
        
    }
    
    public int energy(int index, int [] height, int[] dp){
        if(index==0){
            return 0;
        }
        
        if(dp[index]!=-1){
            return dp[index];
        }
        
        int l = energy(index -1, height, dp) + Math.abs(height[index]-height[index-1]);
        int r = Integer.MAX_VALUE;

        if(index>1){
            r = energy(index -2, height, dp) + Math.abs(height[index]-height[index-2]);
        }

        dp[index] =  Math.min(l, r);
        return dp[index];
    }
}