//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int a[], int n, int X) { 
    
       // Your code Here
       Arrays.sort(a);
       for(int i = 0; i<n-2; i++){
        //   if(i>0 && a[i] == a[i-1]){
        //       continue;
        //   }
           
           int start = i+1;
           int end = n-1;
           int ans = X-a[i];
           
           while(start<end){
               int sum = a[start] + a[end];
               
               if(ans == sum){
                   return true;
               }
               else if(sum<ans){
                   start++;
               }
               else{
                   end--;
               }
           }
       }
       return false;
    
    }
}
