//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
        // code here
        if(n==0){
            return "";
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> last = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            String word = arr[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
                last.put(word, i);
            }
        }
        
        String res = "";
        int max = 0;
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String word = entry.getKey();
            int freq = entry.getValue();
            
            if(freq>max ){
                max = freq;
                res = word;
            }
            else if(max == freq){
                if(last.get(word)>last.get(res)){
                    res = word;
                }
            }
        }
        return res;
    }

}


//{ Driver Code Starts.
// } Driver Code Ends