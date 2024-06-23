class Solution {
    public double minimumAverage(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        Arrays.sort(nums);
        double res = Double.MAX_VALUE;;
        
        while(left<right){
            double avg  = (nums[left]+nums[right])/2.0;
            System.out.println(avg);
            res = Math.min(res, avg);
            System.out.println("res: "+ res);
            left++;
            right--; 
        }
        return res;

    }
}