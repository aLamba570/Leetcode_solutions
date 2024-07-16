//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        
        int res = 0;
        
        int small = (int) Math.pow(10, d-1);
        int large = (int) Math.pow(10, d) -1;
        
        for(int i = small; i<=large; i++){
            if(sumD(i) == s){
                return String.valueOf(i);
            }
        }
        return "-1";
        
        
    }
    
    public int sumD(int n){
        int sum = 0;
        while(n!=0){
            int a = n%10;
            sum+=a;
            n/=10;
        }
        return sum;
    }
}
