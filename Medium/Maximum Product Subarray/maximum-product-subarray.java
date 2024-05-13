//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long result = arr[0]; // Use long instead of int for result
        long overallMax = arr[0]; // Variable to keep track of overall maximum product
        long min = arr[0];
        long max = arr[0];
        
        for(int i = 1; i < n; i++){
            long temp = max;
            max = Math.max(arr[i], Math.max(result * arr[i], min * arr[i]));
            min = Math.min(arr[i], Math.min(temp * arr[i], min * arr[i]));
            result = max;
            overallMax = Math.max(overallMax, result); // Update overall maximum product
        }
        return overallMax;
    }
}
