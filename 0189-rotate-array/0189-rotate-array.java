class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        if (k == 0) {
            return; 
        }

        // while (k > 0) {
        //     int temp = nums[n - 1];
        //     for (int i = n - 1; i > 0; i--) {
        //         nums[i] = nums[i - 1];
        //     }

        //     nums[0] = temp;
        //     k--;
        // }

        int result [] = new int[n];

        for(int i = 0; i<n; i++){
            result[(i+k)%n] = nums[i];
        }

        for(int i = 0; i<n; i++){
            nums[i] = result[i];
        }
    }
}
