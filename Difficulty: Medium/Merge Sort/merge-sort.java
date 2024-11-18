//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        
        if(l<r){
            int m = l +(r-l)/2;
            
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            
            merge(arr, l, m, r);
        }
        
    }
    
    void merge(int[] arr, int l, int m, int r){
        int a = m-l+1;
        int b = r-m;
        
        int[] x = new int[a];
        int[] y = new int[b];
        
        for(int i = 0; i<a; i++){
            x[i] = arr[l+i];
        }
        
        for(int i = 0; i<b; i++){
            y[i] = arr[m+1+i];
        }
        
        
        int i = 0; int j = 0;
        int k = l;
        
        while(i<a && j<b){
            if(x[i]<y[j]){
                arr[k] = x[i];
                i++;
            }else{
                arr[k] = y[j];
                j++;
            }
            k++;
        }
        
        while(i<a){
            arr[k] =x[i];
            i++;
            k++;
        }
        
        while(j<b){
            arr[k] = y[j];
            j++;
            k++;
        }
        
    }
}
