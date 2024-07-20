#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
class Solution:
    def solve(self,height,n,k,dp):
        
            
        if n ==0 :
            return 0
            
        if dp[n] != -1:
            return dp[n]
        
        mini = float('inf')
        for i in range(1,k+1):
            if n-i >= 0:
                left = self.solve(height,n-i,k,dp) + abs(height[n] - height[n-i])
            
                mini = min(mini,left)
        dp[n] = mini
        
        return dp[n]
    
    def minimizeCost(self, height, n, k):
        # code here
        
        dp = [-1]*(n)
        return self.solve(height,n-1,k,dp)

#{ 
 # Driver Code Starts.

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        N, K = map(int, input().split())
        arr = list(map(int, input().split()))
        obj = Solution()
        print(obj.minimizeCost(arr, N, K))
# } Driver Code Ends