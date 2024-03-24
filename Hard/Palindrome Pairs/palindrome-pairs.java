//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String arr[] = new String[N];
            
            for(int i=0; i<N; i++)
                arr[i] = read.readLine();

            Solution ob = new Solution();
            
            if(ob.palindromepair(N,arr))System.out.println("1");
            else System.out.println("0");
        }
    }
}
// } Driver Code Ends




//User function Template for Java

// class Solution {
//     static boolean palindromepair(int n, String arr[]) {
//         // code here
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j) {
//                     continue;
//                 }

//                 String concat1 = arr[i] + arr[j];
                
//                 if (isPalindrome(concat1)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }


class Solution {
    static boolean palindromepair(int n, String arr[]) {
        Map<String, Integer> reverseMap = new HashMap<>();
        // Store reverse of each string along with its index
        for (int i = 0; i < n; i++) {
            String reverse = new StringBuilder(arr[i]).reverse().toString();
            reverseMap.put(reverse, i);
        }

        for (int i = 0; i < n; i++) {
            String curr = arr[i];
            for (int j = 0; j <= curr.length(); j++) {
                String prefix = curr.substring(0, j);
                String suffix = curr.substring(j);

                // Check if prefix is a palindrome and its reversed suffix exists
                if (isPalindrome(prefix) && reverseMap.containsKey(suffix) && reverseMap.get(suffix) != i) {
                    return true;
                }

                // Check if suffix is a palindrome and its reversed prefix exists
                if (isPalindrome(suffix) && reverseMap.containsKey(prefix) && reverseMap.get(prefix) != i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
