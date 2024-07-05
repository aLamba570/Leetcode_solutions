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
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(n, arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String c = a+b;
                String d = b+a;
                return d.compareTo(c);
            }
        };
        
        Arrays.sort(arr, comp);
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        for(String s: arr){
            sb.append(s);
        }
        return sb.toString();
    }
}