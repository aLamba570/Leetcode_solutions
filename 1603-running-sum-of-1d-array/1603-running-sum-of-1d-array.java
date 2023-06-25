class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] runningSum = new int[n];

        for(int i = 0; i<n; i++){
            if(i==0){
                runningSum[i] = nums[i];
                
            }
            else {
                runningSum[i] = runningSum[i - 1] + nums[i];    
            }
        }
        return runningSum;
    }
}