//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
        
        
        Arrays.sort(arr);
        
        int duplicate = -1;
        int missing = -1;
        
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicate = arr[i];
            } else if (arr[i + 1] - arr[i] > 1) {
                missing = arr[i] + 1;
            }
        }
        
        if (arr[n - 1] != n) {
            missing = n;
        }
        
        result[0] = duplicate;
        result[1] = missing == -1 ? 1 : missing; 
        return result;
    }
}