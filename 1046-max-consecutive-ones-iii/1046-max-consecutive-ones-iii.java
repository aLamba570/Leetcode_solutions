class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int n = nums.length;
        int zeros = 0;

        while(r<n){
            if(nums[r] == 0){
                zeros++;
            }
            r++;
            if(zeros>k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
        }
        count = r-l;
        return count;
    }
}