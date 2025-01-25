//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergerandcount(arr, 0, arr.length-1);
        
        
        
    }
    
    static int mergerandcount(int[] arr, int l, int r){
        int count = 0;
        
        if(l<r){
            int mid = (l+r)/2;
            count+=mergerandcount(arr, l, mid);
            count+=mergerandcount(arr, mid+1, r);
            count+=merge(arr, l, mid, r);
            
        }
        return count;
    }
    
    static int merge(int[] arr, int l, int mid, int h){
        int m = mid-l+1;
        int n = h-mid;
        
        int[] larr = new int[m];
        int[] rarr = new int[n];
        
        for(int i = 0; i<m; i++){
            larr[i] = arr[l+i];
        }
        
        for(int i = 0; i<n; i++){
            rarr[i] = arr[mid+1+i];
        }
        
        int i = 0;
        int j = 0; 
        int k = l;
        int count = 0;
        
        while(i<m && j<n){
            if(larr[i]<=rarr[j]){
                arr[k++] = larr[i++];
            }else{
                arr[k++]=rarr[j++];
                count +=(m-i);
            }
        }
        
        while(i<m){
            arr[k++]=larr[i++];
        }
        
        while(j<n){
            arr[k++] = rarr[j++];
        }
        
        return count;
        
    }
}