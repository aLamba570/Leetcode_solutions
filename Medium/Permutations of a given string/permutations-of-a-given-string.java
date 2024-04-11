//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


// class Solution {
//     public List<String> find_permutation(String S) {
//         Set<String> result = new HashSet<>(); // Using a Set to automatically handle duplicates
        
//         if(S.isEmpty()) {
//             result.add("");
//             return new ArrayList<>(result); // Convert Set to List before returning
//         }
        
//         for(int i = 0; i < S.length(); i++) {
//             char currentChar = S.charAt(i);
            
//             String remaining = S.substring(0, i) + S.substring(i + 1);
//             List<String> subPerms = find_permutation(remaining);
            
//             for(String perm : subPerms) {
//                 result.add(currentChar + perm);
//             }
//         }
//          // Convert Set to List before returning
//         List<String> resultList = new ArrayList<>(result);
//         Collections.sort(resultList);
//         return resultList;
//     }
// }

class Solution {
    // Memoization map to store already computed permutations
    Map<String, List<String>> memo = new HashMap<>();

    public List<String> find_permutation(String S) {
        if (memo.containsKey(S)) {
            return memo.get(S);
        }

        Set<String> result = new HashSet<>(); // Using a Set to automatically handle duplicates

        if (S.isEmpty()) {
            result.add("");
        } else {
            for (int i = 0; i < S.length(); i++) {
                char currentChar = S.charAt(i);

                String remaining = S.substring(0, i) + S.substring(i + 1);
                List<String> subPerms = find_permutation(remaining);

                for (String perm : subPerms) {
                    result.add(currentChar + perm);
                }
            }
        }
        // Convert Set to List before returning
        List<String> resultList = new ArrayList<>(result);
        Collections.sort(resultList);
        memo.put(S, resultList); // Store computed permutations in memo
        return resultList;
    }
}
