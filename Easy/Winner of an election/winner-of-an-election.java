//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    // Function to return the name of the candidate that received maximum votes along with their vote count.
    public static String [] winner(String arr[], int n) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int maxVotes = 0;
        String winner = "";

        for (String candidate : map.keySet()) {
            int votes = map.get(candidate);
            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                maxVotes = votes;
                winner = candidate;
            }
        }

        return new String [] {winner, String.valueOf(maxVotes)};
    }
}

