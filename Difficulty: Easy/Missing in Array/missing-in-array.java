//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int res = 0;
        
        if(arr[0] == 2){
            return 1;
        }
        
        for(int i = 0; i<n-1; i++){
            if(arr[i+1] != arr[i]+1){
                res = arr[i]+1;
                return res;
            }
        }
        return arr[n-1]+1;
    }
}