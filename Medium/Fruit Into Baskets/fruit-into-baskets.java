//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] fruits = new int[N];
            for (int i = 0; i < N; i++) fruits[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.totalFruits(N, fruits);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalFruits(int N, int[] fruits) {
        int max = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int right=0; right<fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            
            if(map.size() > 2){
                if(map.get(fruits[left]) -1 == 0){
                    map.remove(fruits[left]);
                }
                else {
                    map.put(fruits[left], map.get(fruits[left]) -1);
                }
                left++;
            }
            
            if(map.size() <= 2){
                max = Math.max(right - left + 1, max);
            }
        }
        
        return max;
    }
}