//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            
            for(int j = i + 1; j < n - 2; j++){
                if(j > i + 1 && arr[j] == arr[j - 1]){
                    continue;
                }
                
                int left = j + 1;
                int right = n - 1;
                
                while(left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    
                    if(sum == k){
                        ArrayList<Integer> quadruple = new ArrayList<>();
                        quadruple.add(arr[i]);
                        quadruple.add(arr[j]);
                        quadruple.add(arr[left]);
                        quadruple.add(arr[right]);
                        result.add(quadruple);
                        
                        while(left < right && arr[left] == arr[left + 1]){
                            left++;
                        }
                        while(left < right && arr[right] == arr[right - 1]){
                            right--;
                        }
                        
                        left++;
                        right--;
                    }
                    
                    else if(sum < k){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        
        // Sort each quadruple before adding it to the result list
        for (ArrayList<Integer> quadruple : result) {
            Collections.sort(quadruple);
        }
        
        // Define custom comparator to sort the list of lists based on the first element of each list
        Collections.sort(result, (a, b) -> a.get(0).compareTo(b.get(0)));
        
        return result;
    }
}
