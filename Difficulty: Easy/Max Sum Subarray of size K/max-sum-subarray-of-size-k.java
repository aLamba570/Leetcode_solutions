//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        // code here
        int l = 0;
        int r = 0;
        
        long sum = 0;
        long kmax = Integer.MIN_VALUE;
        
        while(r<n){
            sum+=arr.get(r);
            if(r-l+1<k){
                r++;
            }
            else if(r-l+1==k){
                kmax = Math.max(sum, kmax);
                sum -=arr.get(l);
                l++;
                r++;
            }
        }
        return kmax;
        
        
    }
}