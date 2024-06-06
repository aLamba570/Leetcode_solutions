//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    long substrCount (String s, int k) {
        return calcCount(s, k) - calcCount(s, k-1);
    }
    
    static long calcCount(String s , int k ){
        int l = 0;
        int r = 0;
        int count = 0;
        long ans = 0;
        int n = s.length();
        int[] freq = new int[256];
        
        while(r < n){
            freq[s.charAt(r) - 'a']++;
            if(freq[s.charAt(r) - 'a'] == 1){
                count++;
            }
            
            while(l <= r && count > k){
                freq[s.charAt(l) - 'a']--;
                if(freq[s.charAt(l) - 'a'] == 0){
                    count--;
                }
                l++;
            }
            ans += r - l + 1;
            r++;
        }
        return ans;
    }
}
