//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int nums[], int n)
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            
            if(val%2 == 1){
                list.add(key);
            }
        }
        
        int[] result = new int[2];
        for (int i = 0; i < 2; i++) {
            result[i] = list.get(i);
        }
        
        if (result[0] < result[1]) {
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        
        return result;
        
    }
}