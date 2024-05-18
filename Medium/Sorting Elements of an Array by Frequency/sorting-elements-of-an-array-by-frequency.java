//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        list.sort((entry1, entry2) -> {
            int freq = entry2.getValue().compareTo(entry1.getValue());
            if(freq == 0){
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return freq;
        });
        
        
        ArrayList<Integer> listt = new ArrayList<>();
        int index = 0;
        for(Map.Entry<Integer, Integer> mod : list){
            int num = mod.getKey();
            int freqC = mod.getValue();
            for(int i = 0; i<freqC; i++){
                listt.add(num);
            }
        }
        return listt;
    }
}