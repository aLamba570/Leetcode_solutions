class Solution:
    def knapsack(self, w, val, wt):
        n = len(wt)
        dp = [[-1 for _ in range(w+1)] for _ in range(n+1)]
        return self.recursive(w, val, wt, n, dp)
        
    def recursive(self, w, val, wt, n, dp):
        if n == 0 or w == 0:
            return 0
            
        if dp[n][w] != -1:
            return dp[n][w]
        
        
        if wt[n-1] <= w:
            inclusive = val[n-1] + self.recursive(w - wt[n-1], val, wt, n-1,dp)
            exclusive = self.recursive(w, val, wt, n-1,dp)
            dp[n][w] = max(inclusive, exclusive)
        else:
            dp[n][w] = self.recursive(w, val, wt, n-1,dp)
            
        return dp[n][w]

