//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for (int i=0; i<n; i++)
        {
            if (arr[i] < 0)
            {
                neg.add(arr[i]); // negative values store in this list
            }
            else 
            {
                pos.add(arr[i]); // and positive in this 
            }
        }
        
        int a = 0, b = 0, c = 0; // itrators for index moving
        for (int i=0; i<n; i++)
        {
            if (i < pos.size()) // i is less then pos list size the this condition exicutes 
            {
                arr[a++] = pos.get(b++); // why 1st pos list means as per question 
            }
            if (i< neg.size()) // for second index neagive values 
            {
                arr[a++] = neg.get(c++);
            }
        }
    }
}