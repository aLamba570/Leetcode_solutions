//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

// } Driver Code Ends




//User function Template for Java


class Solution {
    public long kthElement(int k, int nums1[], int nums2[]) {
        
        ArrayList<Integer> mergedList = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                mergedList.add(nums1[i]);
                i++;
            } else {
                mergedList.add(nums2[j]);
                j++;
            }
        }
        
        while (i < n) {
            mergedList.add(nums1[i]);
            i++;
        }
        
        while (j < m) {
            mergedList.add(nums2[j]);
            j++;
        }
        
        return mergedList.get(k-1);
    }
}