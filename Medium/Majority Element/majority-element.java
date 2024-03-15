//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : a){
           if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0) + 1);
           }
           else{
               map.put(num, 1);
           }
        }
        
        
        for(int key: map.keySet()){
            if(map.get(key) > size/2){
                return key;
            }
        }
        return -1;
        
    
    }
}