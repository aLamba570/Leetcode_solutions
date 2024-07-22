class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        boolean [] seen = new boolean[n+1];

        for(int num: nums){
            if(num>0 && num<=n){
                seen[num] = true;
            }
        }

        for(int i = 1; i<=n; i++){
            if(!seen[i]){
                return i;
            }
        }

        // If seen contains all elements 1 to n
        // the smallest missing positive number is n + 1
        return n+1;
    }
}