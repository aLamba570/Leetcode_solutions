class Solution {
    public int maxSubArray(int[] Arr) {
        int currentSum = Arr[0];
        int maxSum = Arr[0];

        for(int i = 1; i<Arr.length; i++){
            currentSum = Math.max(Arr[i], currentSum + Arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }
}