//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        // code here
        int i = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i<s.length()){
            int count = 0;
            char c = s.charAt(i);
            
            while(i<s.length() && s.charAt(i) == c){
                count++;
                i++;
            }
            
            sb.append(c).append(count);
            
            
        }
        return sb.toString();
    }
}
    