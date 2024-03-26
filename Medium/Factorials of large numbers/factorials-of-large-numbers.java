//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); // Initialize result with 1

        for (int i = 2; i <= N; i++) {
            multiply(result, i); // Multiply result by i
        }

        return result;
    }

    static void multiply(ArrayList<Integer> num, int factor) {
        int carry = 0;
        for (int i = num.size() - 1; i >= 0; i--) {
            int product = num.get(i) * factor + carry;
            num.set(i, product % 10);
            carry = product / 10;
        }

        while (carry != 0) {
            num.add(0, carry % 10);
            carry /= 10;
        }
    }
}