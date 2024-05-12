//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long n) {
        // Your Code Here
        return mergeSort(arr, 0, n - 1);
    }

    static long mergeSort(long[] arr, long left, long right) {
        long count = 0;

        if (left < right) {
            long mid = (left + right) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);

            count += merge(arr, left, mid, right);
        }
        return count;
    }

    static long merge(long[] arr, long left, long mid, long right) {
        long count = 0;

        long[] leftA = new long[(int) (mid - left + 1)];
        long[] rightA = new long[(int) (right - mid)];

        for (int i = 0; i < leftA.length; i++) {
            leftA[i] = arr[(int) (left + i)];
        }

        for (int i = 0; i < rightA.length; i++) {
            rightA[i] = arr[(int) (mid + 1 + i)];
        }

        int i = 0;
        int j = 0;
        int k = (int) left;

        while (i < leftA.length && j < rightA.length) {
            if (leftA[i] <= rightA[j]) {
                arr[k++] = leftA[i++];
            } else {
                arr[k++] = rightA[j++];

                // Count inversions
                count += (mid - left + 1) - i;
            }
        }

        // Copy remaining elements of leftA[], if any
        while (i < leftA.length) {
            arr[k++] = leftA[i++];
        }

        // Copy remaining elements of rightA[], if any
        while (j < rightA.length) {
            arr[k++] = rightA[j++];
        }

        return count;
    }
}
