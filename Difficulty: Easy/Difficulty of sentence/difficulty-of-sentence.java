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
            String S = read.readLine();
            Solution ob = new Solution();
            int result = ob.calcDiff(S);
            
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int calcDiff(String s)
    {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        String[] words = s.toLowerCase().split("\\s+");
        
        int hc = 0;
        int ec = 0;
        
        for (String word : words) {
            if (isHardWord(word, vowels)) {
                hc++;
            } else {
                ec++;
            }
        }
        
        return 5 * hc + 3 * ec;
    }
    
    private boolean isHardWord(String word, Set<Character> vowels) {
        int vc = 0, cc = 0;
        int conC = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.contains(ch)) {
                vc++;
                conC = 0;
            } else {
                cc++;
                conC++;
                
                if (conC >= 4) {
                    return true;
                }
            }
        }

        return cc > vc;
    }
}
