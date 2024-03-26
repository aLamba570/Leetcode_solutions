//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends


class Solution 
{
    String newSt = "";
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String str = "";
        // Split the string by dots
        String[] strArr = S.split("\\.");
        str += strArr[strArr.length-1];
        for (int i=strArr.length-2;i>=0;i--) {
        str = str + "." + strArr[i];
    }
    return str;
    }
}
