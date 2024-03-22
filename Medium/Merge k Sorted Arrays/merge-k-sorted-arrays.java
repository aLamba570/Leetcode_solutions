//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends




//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        
        int row = arr.length;
        int col = arr[0].length;
        int top = 0;
        int bottom = col -1;
        int left = 0;
        int right = row -1;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr == null || row == 0 || col == 0){
            return list;
        }
        
        while(top<=bottom && left <= right){
            for(int i = left; i<=right; i++){
                list.add(arr[top][i]);
            }
            top++;
            
            for(int i = top; i<=bottom; i++){
                list.add(arr[i][right]);
            }
            right--;
        }
        
        if(top<=bottom){
            for(int i = left; i>=right; i--){
                list.add(arr[bottom][i]);
            }
            bottom--;
        }
        
        if(left <= right) {
            for (int i = bottom; i >= top; i--) {
                list.add(arr[i][left]);
            }
            left++;
        }
        
        Collections.sort(list);
        return list;
        
        
    }
}