class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else if(nums[i] != nums[i - 1]){
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}