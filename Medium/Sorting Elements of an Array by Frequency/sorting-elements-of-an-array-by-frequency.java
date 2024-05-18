/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int [] nums = new int[n];
		    for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
		    
		    
		   HashMap<Integer, Integer> map = new HashMap<>();
		    
		    for(int num : nums){
		        map.put(num, map.getOrDefault(num, 0) + 1);
		    }
		    
		    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		    
            list.sort((entry1, entry2) -> {
                int freqComparison = entry2.getValue().compareTo(entry1.getValue());
                if (freqComparison == 0) {
                    return entry1.getKey().compareTo(entry2.getKey());
                }
                return freqComparison;
            });
            
		    int [] result = new int[n];
		    int index = 0;
		    for(Map.Entry<Integer, Integer> mod : list){
		        int number = mod.getKey();
		        int freq = mod.getValue();
		        for (int i = 0; i < freq; i++) {
                    result[index++] = number;
                }
		    }
		    
		    for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
		}
			
	}
}