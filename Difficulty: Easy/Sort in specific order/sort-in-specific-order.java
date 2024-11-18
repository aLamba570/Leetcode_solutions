//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the test cases
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the Long integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into Long integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            // Convert ArrayList to array
            Long[] arr = new Long[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();
            ob.sortIt(arr);

            StringBuilder output = new StringBuilder();
            for (Long value : arr) {
                output.append(value).append(" ");
            }
            System.out.println(output.toString().trim());
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public void sortIt(Long arr[]) {
        int n = arr.length;

        int a = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                long temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
                a++;
            }
        }

        Arrays.sort(arr, 0, a);
        int s = 0;
        int e = a - 1;
        while (s < e) {
            long temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        Arrays.sort(arr, a, n);
    }
}