class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(nums, dp, n-1);
    }

    public int solve(int[] nums,int[] dp, int i){
        if(i<0){
            return 0;
        }
        
        if (dp[i] != -1) {
            return dp[i];
        }

        int robCurrent = nums[i] + solve(nums, dp, i - 2);
        int skipCurrent = solve(nums, dp, i-1);

        dp[i] = Math.max(robCurrent, skipCurrent);
        return dp[i];
    }
}